package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IcciforSim {
	
	public static String icciforSimCard() throws ClassNotFoundException, SQLException{
		
	 String str=null;
	 Class.forName("oracle.jdbc.OracleDriver");
	   Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@10.86.143.27:1556:CFICCB", "TESTUSER","TESTUSER");
	   Statement stmt = conn.createStatement();
	   stmt.executeQuery("	");
	   ResultSet rs = stmt.getResultSet();
	   if(rs.next()){
		  str  = rs.getString(1);
	   }
	return str;
	}

}
