package cg.ocrs.dao;

import java.sql.SQLException;

import cg.ocrs.model.UserRole;

public interface IUserRepo 	{
	
	
	
	
	
	
public UserRole addUser(UserRole user) throws SQLException;
	
	public UserRole createUser(UserRole user) throws SQLException;
	
	public UserRole getUserByUserName(String userName) throws SQLException;
	
	public boolean deleteUser(String userName) throws SQLException; 

}
