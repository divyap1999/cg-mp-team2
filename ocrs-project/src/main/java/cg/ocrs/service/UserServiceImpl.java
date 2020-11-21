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

	@Override
	public UserRole getUser(String userName) throws SQLException {
		
		return repo.getUserByUserName(userName);
	}

	@Override
	public boolean deleteUser(String userName) throws SQLException {
		
		return repo.deleteUser(userName);
	}

}
