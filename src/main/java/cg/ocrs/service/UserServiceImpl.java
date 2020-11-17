package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.Login;

public class UserServiceImpl implements IUser {
	
	IUserRepo repo;

	public Login addUser(Login user) throws SQLException {
		repo = new UserRepoImpl();
		return repo.addUser(user);
		
	}
	

}
