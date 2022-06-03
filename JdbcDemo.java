  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;

public class JdbcDemo
{

	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		String host="localhost";
		String port="3306";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc::mysql://"+host+":"+port+"/worker","root","12345678");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select * from worker");
		while(rs.next())
		{
			System.out.println(rs.getString("firstname"));
			System.out.println(rs.getString("lastname"));
		}
		
		
	}

}
