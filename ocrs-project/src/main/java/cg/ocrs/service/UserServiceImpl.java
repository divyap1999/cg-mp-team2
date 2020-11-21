package cg.ocrs.service;

import java.sql.SQLException;
import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.UserRole;

public class UserServiceImpl implements IUser{

	IUserRepo repo;
	
	public UserServiceImpl()  {
	 repo=new UserRepoImpl();
	}
	
	
	@Override
	public UserRole addUser(UserRole user) throws SQLException {
		
		return repo.addUser(user);
	}

	public boolean getUser(String userName, String password) throws SQLException {
		
		UserRole user = repo.getUserByUserName(userName);
		if(user.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(String userName) throws SQLException {
		
		return repo.deleteUser(userName);
	}


	@Override
	public UserRole getUserRole(String userName, String password) throws SQLException {
		
		return repo.getUserByUserName(userName);
	}

}
