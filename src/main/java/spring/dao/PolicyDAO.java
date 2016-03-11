package spring.dao;

import java.util.List;
import spring.model.Policy;

public interface PolicyDAO {
	
	public void saveOrUpdate(Policy policy);
	
	public void delete(int policyId);
	
	public Policy get(int policyId);
	
	public List<Policy> list();

}
