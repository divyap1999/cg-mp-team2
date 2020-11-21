package cg.ocrs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	static Connection connection;
	public static Connection getConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
											"system","Gayathri");
		return connection;
	}


}
