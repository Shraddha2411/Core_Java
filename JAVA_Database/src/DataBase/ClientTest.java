package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {

	public static void main(String[] args)throws SQLException
	{
		Connection connection=DBUtil1.getConnection();
		if(connection!=null)
			System.out.println("JDBC:connection is taken..");
		Statement st=connection.createStatement();
		String sql="select * from informtion_table";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			
		}
		try {
			connection.close();
			st.close();
			
		}
		catch(Exception e)
		{System.out.println(e);
		
		}
	}

}
