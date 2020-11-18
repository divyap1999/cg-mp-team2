package cg.ocrs.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cg.ocrs.exception.UserNotFoundException;
import cg.ocrs.model.UserRole;

public abstract class UserRepoImpl implements IUserRepo{
	PreparedStatement psmt;
	ResultSet userResultSet;
	Connection connection;

	public UserRepoImpl() throws SQLException {
		connection=ConnectionUtil.createConnection();
	}

	public UserRole addUser(UserRole user) throws SQLException {
		psmt=connection.prepareStatement("insert into login_page values(?,?,?)");
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());
		psmt.setString(3, user.getRolecode());
		
		int count=psmt.executeUpdate();
		return user;
	}
	
	@Override
	public UserRole getUserByUserName(String userName) throws SQLException {
		psmt=connection.prepareStatement("select * from login_page where username=?");
		psmt.setString(1, userName);
		userResultSet=psmt.executeQuery();
		if(!userResultSet.next()) {
			throw new UserNotFoundException("User with username ["+userName+"] does not exist");
		}
		UserRole user=new UserRole();
		user.setUserName(userResultSet.getString("username"));
		user.setPassword(userResultSet.getString("password"));
		user.setRolecode(userResultSet.getString("role_code"));
		return user;
	}


	public boolean deleteUser(String userName) throws SQLException {

		UserRole user = getUserByUserName(userName);
	//	Connection con = null;
		psmt = con.prepareStatement("delete from login_page where user=?");
		psmt.setString(1, userName);
		int isdeleted = psmt.executeUpdate();
		
		return isdeleted>0;
		
	}

}
