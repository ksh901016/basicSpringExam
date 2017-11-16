package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://hyunsworld.co.kr:3306/sunghyun90?useSSL=false";
	private static final String USER = "sunghyun90";
	private static final String PW = "vlwysxn90!";
	
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
			
			System.out.println(con);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
