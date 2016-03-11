package TestDB;
import spring.config.MvcConfiguration;
import spring.dao.PolicyDAOImpl;
import spring.dao.TempPolicyStatusDAOImpl;

public class TestMvcConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MvcConfiguration mvcConfiguration = new MvcConfiguration();
//		TempPolicyStatusDAOImpl tempPolicyStatusDAOImpl = mvcConfiguration.getTempPolicyStatus();
//		tempPolicyStatusDAOImpl.printList(tempPolicyStatusDAOImpl.list());
//		
		PolicyDAOImpl policyDAOImpl = mvcConfiguration.getPolicyId();
		policyDAOImpl.list();
	}
	
}
