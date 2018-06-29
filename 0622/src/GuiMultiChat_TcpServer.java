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
		setTitle("ä��â ����!");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("�Է��ϼ���");
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

	// ���ο����� ���� ������ ����� ��ŸƮ�� ����!
	public static void main(String args[]) {
		Frserver f = new Frserver();
		new GuiMultiChat_TcpServer().start();
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("������ ���۵Ǿ���");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "���� �����ϼ̽��ϴ�.");
				// ���� ���ù� �ϳ� �����. �����带 �̿��Ѵ�
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();

				System.out.println("������ ����: " + thread.getName());
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
				System.out.println("sendToall ����� ����");
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
				System.out.println("���� ���ù� ���� IO ����");
			}
		}

		public void run() {
			String name = "";

			try {
				name = in.readUTF();
				sendToAll("#" + name + "���� �����̽��ϴ�.");

				clients.put(name, out);
				System.out.println("���� ������ ���� " + clients.size() + "�Դϴ�");
				System.out.print("���� ������ ���:");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("���ù� ���� io����");
			} finally {
				sendToAll("#" + name + "���� �����̽��ϴ�~");
				JFrame clinets;
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]���� ������ ������");
				System.out.println("���� ������ ����" + clients.size() + "�Դϴ�");
			}
		}
	}
}
