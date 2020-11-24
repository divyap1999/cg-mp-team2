package cg.ocrs.dao;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import cg.ocrs.model.Policy;
class PolicyDaoImplTest {
     IPolicyDao policyrepo=new PolicyDaoImpl();     
   @Test
	public void testGetAllPolicies() throws SQLException{
		List<Policy> policies = policyrepo.getAllPolicies();
			List<Policy> saved_policies = new ArrayList<Policy>();
			saved_policies.add(new Policy(200, 50000, 100452686));
	        saved_policies.add(new Policy(201, 45960, 100452645));
			saved_policies.add(new Policy(202, 12480, 100452423));
			saved_policies.add(new Policy(203, 25125, 100452125));
              assertEquals(policies,saved_policies);
              }
		}
	

	