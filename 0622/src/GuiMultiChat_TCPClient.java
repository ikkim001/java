import java.net.Socket;

public class GuiMultiChat_TCPClient {
	public static void main(String args[]) {
		if(args.length !=1) {
			System.out.println("USAGE:java GuiMultiChat_TCPClient대화명");
			System.exit(0);
		}
		try{
			String serverip = "127.0.0.1";
			
			Socket socket = new Socket(serverip,7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket,args[0]));
			Thread receiver = new Thread(new ClientRecevier(socket));
			sender.start();
			receiver.start();
		}catch(ConnectException ce){
