package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.UserRole;

public class UserServiceImpl implements IUser{

	IUserRepo repo;
	
		public UserRole addUser(UserRole user) throws SQLException {
			repo = new UserRepoImpl();
			return repo.addUser(user);
			
		}
}
