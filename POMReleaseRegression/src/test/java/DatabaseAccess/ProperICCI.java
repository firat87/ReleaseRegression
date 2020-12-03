package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProperICCI {
	
	public String DBIcci (String icci) throws ClassNotFoundException, SQLException{
		
		 Class.forName("oracle.jdbc.OracleDriver");
		   Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@10.86.143.27:1556:CFICCB", "TESTUSER","TESTUSER");
		   Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		   stmt.executeQuery("SELECT A.ICCI, B.CAMPAIGN_CODE FROM CCB.CCB_IMSI_POOL A INNER JOIN CCB.CCB_ICCI_SIM_POOL B ON A.ICCI = B.ICCI WHERE A.GSM_NO IS NULL AND A.START_DATE IS NULL AND A.IMSI_STATUS_CODE = 'PS' AND A.BRAND_CODE = 'MC' AND B.USAGE_REASON_CODE = 'AK' AND B.LOCK_IND = 'H' AND B.ICCI_STATUS_CODE = 'BA'AND B.CAMPAIGN_CODE = 'MNP000'AND A.ICCI LIKE '89900%'");
		   ResultSet rs = stmt.getResultSet();
		   int randomNum = 1 + (int)(Math.random() * 200);
		   System.out.println(randomNum);
		   rs.absolute(randomNum);
		   icci  = rs.getString("ICCI");
		   return icci; 
	}

}
