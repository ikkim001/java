import java.sql.*;

public class Connetdatabase {

	public static Connection makeConnection()

	{

		String url = "jdbc:mysql://localhost/book_db?serverTimezone=JST";

		String id = "root";

		String password = "asdfg";

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("����̹� ���� ����");

			con = DriverManager.getConnection(url, id, password);

			System.out.println("�����ͺ��̽� ���� ����");

		} catch (ClassNotFoundException e) {

			System.out.println("����̹��� ã�� �� �����ϴ�.");

		} catch (SQLException e) {

			System.out.println("���ῡ �����Ͽ����ϴ�.");

		}

		return con;

	}

	public static void main(String arg[]) throws SQLException {

		Connection con = makeConnection();

	}

}