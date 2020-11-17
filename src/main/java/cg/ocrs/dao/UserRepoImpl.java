//package cg.ocrs.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import cg.ocrs.model.Login;
//
//public class UserRepoImpl implements IUserRepo{
//
//	PreparedStatement psmt;
//	ResultSet studentResultSet;
//	Connection connection;
//
//	public UserRepoImpl() throws SQLException {
//		connection=ConnectionUtil.getConnection();
//	}
//
//	public Login addUser(Login user) throws SQLException {
//		psmt=connection.prepareStatement("insert into credentials values(?,?,?)");
//		psmt.setString(1, user.getUsername());
//		psmt.setString(2, user.getPassword());
//		psmt.setString(3, user.getRolecode());
//		
//		int count=psmt.executeUpdate();
//		return user;
//	}
//	
//	
//}
