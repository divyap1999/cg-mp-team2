package cg.ocrs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	 static Connection con;
	 public static Connection getConnection() throws SQLException {
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","1234");
		 return con;
	 }
}
