package cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import cg.ocrs.model.Policy;

public interface IPolicyService {
public List<Policy> getAllPolicies() throws SQLException;

}
