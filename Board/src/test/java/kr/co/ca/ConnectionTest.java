package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectionTest {
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USERNAME ="ca";
	private final String PASSWORD ="ca";
	
	@Test
	public void connectionTest() {
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("커넥션");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
