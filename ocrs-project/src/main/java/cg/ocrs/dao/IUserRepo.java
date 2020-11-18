package cg.ocrs.dao;

import java.sql.SQLException;

import cg.ocrs.model.UserRole;

public interface IUserRepo {

	UserRole addUser(UserRole user) throws SQLException;
}
