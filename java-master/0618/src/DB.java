import java.sql.*;
public class DB {
	public static Connection makeConnection()
	{
		String url = "jdbc:mysql://localhost/book_db";
		String id = "root";
		String password = "password";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driber");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url,id,password);
			System.out.println("�����ͺ��̽� ���� ����");
		}catch (ClassNotFoundException e){
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
		}
}