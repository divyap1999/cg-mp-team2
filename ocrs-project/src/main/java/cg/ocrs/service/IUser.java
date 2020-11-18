package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.model.UserRole;

public interface IUser {

	public UserRole addUser(UserRole user) throws SQLException;
}
