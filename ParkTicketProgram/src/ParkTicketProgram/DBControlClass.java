package ParkTicketProgram;

import java.sql.*;

public class DBControlClass {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root1717";
	private Connection conn = null;
	private Statement stmt = null;
	

	public DBControlClass() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeToDB(ListSaving ls) {
		try {
			for (OrderList order : ls.getData()) {
				order.setGenderNum();
				String sql = "INSERT INTO test1 VALUES (" + order.getCSV() + ")";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}
		} catch (Exception e) {
			
		}
	}
}
