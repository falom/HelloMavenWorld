package spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.model.Policy;
import spring.model.TempPolicyStatus;

public class PolicyDAOImpl implements PolicyDAO{
	
	private JdbcTemplate jdbcTemplate;

	public PolicyDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(Policy policy) {
		if (policy.getPolicyId() > 0) {
		} else {
		}
	}

	public void delete(int policyId) {
		String sql = "DELETE FROM Policy WHERE StatusCode=?";
		jdbcTemplate.update(sql, policyId);
	}

	public Policy get(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Policy> list() {
		String sql = "SELECT * FROM Policy";
		List<Policy> listPolicy = jdbcTemplate.query(sql, new RowMapper<Policy>() {

			public Policy mapRow(ResultSet result, int rowNum) throws SQLException {
				Policy policy = new Policy();
				policy.setPolicyId(result.getInt("PolicyId"));
				System.out.println("No:"+result.getInt("PolicyId")+"Quotation:"+result.getString("QuotationNumber"));
				return policy;
			}
		});

		return listPolicy;
	}

}
