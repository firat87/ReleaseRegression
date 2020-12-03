package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerAM {
	
	public static String CustomerNo(String customerno) throws ClassNotFoundException, SQLException{
		  Class.forName("oracle.jdbc.OracleDriver");
		  Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@10.86.143.27:1556:CFICCB", "TESTUSER","TESTUSER");
		  Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		  stmt.executeQuery("select * from ccb.ccb_customer where customer_id like '4%' and type!='F' and VERIFIED='Y' and ID_NO is not null order by cr_date desc");
		   ResultSet rs = stmt.getResultSet();
		   int randomNum = 1 + (int)(Math.random() * 500);
		   System.out.println(randomNum);
		   rs.absolute(randomNum);
		   String s  = rs.getString("CUSTOMER_ID");
		   System.out.println(s);
			  customerno = s;
		return customerno;
	}

}
