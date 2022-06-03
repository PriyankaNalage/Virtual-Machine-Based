import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConn2 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		String Host="localhost";
		String Port="3306";
		Class.forName("com.mysql,jdbc,Driver");
		Connection con=DriverManager.getConnection("jdbc::mysql://"+Host+":"+Port+"/Marvellous","root","12345678");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+" "+rs.getInt(3)+" "+rs.getString(4));  
		}// 1,2 3,4 ==Columns number
	}

}
