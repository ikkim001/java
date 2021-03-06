import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Frserver extends JFrame {
	JTextArea ta;
	JTextField tf;

	public Frserver() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅창 서버!");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("입력하세요");
		ta = new JTextArea(25, 40);
		tf = new JTextField(25);

		add(label, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);
	}
}

public class GuiMultiChat_TcpServer {
	HashMap clients;

	GuiMultiChat_TcpServer() {
		clients = new HashMap();

		Collections.synchronizedMap(clients);
	}

	// 메인에서는 새로 생성자 만들고 스타트를 실행!
	public static void main(String args[]) {
		Frserver f = new Frserver();
		new GuiMultiChat_TcpServer().start();
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버가 시작되었다");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "에서 접속하셨습니다.");
				// 서버 리시버 하나 만든다. 쓰레드를 이용한다
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();

				System.out.println("쓰레드 네임: " + thread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void sendToAll(String msg) {

		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				System.out.println("sendToall 입출력 에러");
			}
		}
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("서버 리시버 소켓 IO 에러");
			}
		}

		public void run() {
			String name = "";

			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다.");

				clients.put(name, out);
				System.out.println("현재 접속자 수는 " + clients.size() + "입니다");
				System.out.print("현재 접속자 목록:");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("리시버 도중 io에러");
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다~");
				JFrame clinets;
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]에서 접속을 종료함");
				System.out.println("현재 접속자 수는" + clients.size() + "입니다");
			}
		}
	}
}
