package ConnectionManager;

import java.sql.*;

public class ConnectionManager {

	//public static void main(String[] args) {
		// TODO Auto-generated method stu
   Connection con = null;
   
    public Connection establishConnection() throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeva","root","root");
    	return con;
	}
     
    public void closeConnection() throws SQLException

    {
    	con.close();
    }
}
