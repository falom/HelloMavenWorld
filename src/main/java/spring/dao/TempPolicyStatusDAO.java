package spring.dao;

import java.util.List;
import spring.model.TempPolicyStatus;

public interface TempPolicyStatusDAO {
	
	public void saveOrUpdate(TempPolicyStatus tempPolicyStatus);
	
	public void delet(int StatusCode);
	
	public TempPolicyStatus get(int statusCode);

	public List<TempPolicyStatus> list();

}
