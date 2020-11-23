package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.model.UserRole;

public interface IUserService {

	public UserRole addUser(UserRole user) throws SQLException;
	
	public boolean getUser(String userName, String password) throws SQLException;
	
	public UserRole getUserRole(String userName, String password) throws SQLException;
	
	public boolean deleteUser(String userName)throws SQLException;
}
