package cg.ocrs.service;

import java.sql.SQLException;
import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.exception.LoginNotMatchedException;
import cg.ocrs.exception.UserNotFoundException;
import cg.ocrs.model.UserRole;

public class UserServiceImpl implements IUserService{

	IUserRepo repo;
	
	public UserServiceImpl()  {
	 repo=new UserRepoImpl();
	}
	
	
	public UserRole addUser(UserRole user) throws SQLException {
		
		return repo.addUser(user);
	}

	public boolean isValidUser(String userName, String password, String roleCode) throws SQLException {
		
		
		UserRole user = repo.getUserByUserName(userName);
		if(user.getPassword().equals(password) && user.getRoleCode().equals(roleCode)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean deleteUser(String userName) throws SQLException {
		
		return repo.deleteUser(userName);
	}


	public UserRole getUserRole(String userName, String password) throws SQLException {
		
		return repo.getUserByUserName(userName);
	}

}