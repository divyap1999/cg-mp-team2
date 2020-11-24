package cg.ocrs.dao;

import java.sql.SQLException;
import java.util.List;
import cg.ocrs.model.Policy;
public interface IPolicyDao {
     public List<Policy> getAllPolicies() throws SQLException;

public 	Policy addPolicy(Policy policy) throws SQLException;
}
