package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchGSM {
	
	public static String DBData () throws ClassNotFoundException, SQLException{
		
		  Class.forName("oracle.jdbc.OracleDriver");
		  Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@10.86.143.27:1556:CFICCB", "TESTUSER","TESTUSER");
		  Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		  stmt.executeQuery("SELECT * FROM ccb.ccb_subscriber cs, ccb.ccb_subscriber_package csp, ccb.ccb_package cp, ccb.ccb_imsi_pool cip, ccb.ccb_gsm_pool cgp, ccb.ccb_icci_sim_pool cisp WHERE     cs.status = 'A' AND cs.billing_period = '11' AND cs.gsm_no = csp.gsm_no AND cs.start_date = csp.start_date AND cs.gsm_no = cip.gsm_no AND cs.start_date = cip.start_date AND cip.icci = cisp.icci AND cs.customer_id IN (SELECT customer_id FROM ccb.ccb_customer WHERE     TYPE = 'S' AND NVL (blacklist_ind, 'H') = 'H' AND NVL (graylist_ind, 'H') = 'H' AND verified = 'Y' AND citizenship = 'TR') AND csp.package_id = cp.package_id AND cp.status = 'A' AND cp.post_ind = 'H' AND cp.brand_code = 'MC' AND cip.gsm_no = cgp.gsm_no AND cip.imsi_Status_code = 'AK' AND cip.brand_code = 'MC' AND cip.post_ind = 'H' AND NVL (cgp.number_type, 'X') <> 'S' --AND cgp.reservation_type = 'A' AND cgp.stock_type = 'N' AND cgp.STATUS = 'A' AND cisp.card_type = 'NO' AND cisp.usage_reason_code = 'AK' AND cisp.icci_status_code = 'AB' AND cisp.campaign_code = 'DEF_MC' AND cs.start_Date > SYSDATE-95");
		   ResultSet rs = stmt.getResultSet();
		   int randomNum = 1 + (int)(Math.random() * 500);
		   System.out.println(randomNum);
		   rs.absolute(randomNum);
		   String gsm  = rs.getString("GSM_NO");
		   System.out.println(gsm);
		return gsm;
	}

}
