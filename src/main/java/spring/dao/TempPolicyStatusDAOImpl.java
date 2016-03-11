package spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.sql.DataSource;

import spring.model.TempPolicyStatus;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class TempPolicyStatusDAOImpl implements TempPolicyStatusDAO {

	private JdbcTemplate jdbcTemplate;

	public TempPolicyStatusDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(TempPolicyStatus tempPolicyStatus) {
		// TODO Auto-generated method stub
		if (tempPolicyStatus.getStatusCode() > 0) {
		} else {
		}
	}

	public void delet(int statusCode) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM TempPolicyStatus WHERE StatusCode=?";
		jdbcTemplate.update(sql, statusCode);
	}

	public TempPolicyStatus get(int statusCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TempPolicyStatus> list() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM TempPolicyStatus";
		List<TempPolicyStatus> listTempPolicyStatus = jdbcTemplate.query(sql, new RowMapper<TempPolicyStatus>() {

			public TempPolicyStatus mapRow(ResultSet result, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				TempPolicyStatus tempPolicyStatus = new TempPolicyStatus();
				tempPolicyStatus.setStatusCode(result.getInt("StatusCode"));
				tempPolicyStatus.setStatus(result.getString("Status"));
				tempPolicyStatus.setDescription(result.getString("Description"));
				tempPolicyStatus.setUpdatedDatetime(result.getTimestamp("UpdatedDatetime"));
				tempPolicyStatus.setUpdatedBy(result.getString("UpdatedBy"));
				return tempPolicyStatus;
			}
		});

		return listTempPolicyStatus;
	}

	public void printList(List<TempPolicyStatus> listTempPolicyStatus){
		for (TempPolicyStatus aList : listTempPolicyStatus) {
			System.out.println(aList.getUpdatedDatetime()+"  "+aList.getStatusCode() + ": " + aList.getStatus());
			
        }
         
	}
}
