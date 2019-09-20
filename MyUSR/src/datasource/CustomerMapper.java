  
package datasource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Customer;
import domain.DomainObject;

public class CustomerMapper implements DataMapper {
	private static final String insertCustomerStatementString = 
			"INSERT INTO users VALUES (?, ?, ?, ?, ?)";
	
	private static final String findUserString = 
			"SELECT * from users WHERE id = ?";
	
	public static CustomerMapper getThisClass() {
		// TODO Auto-generated constructor stub
		return new CustomerMapper();
	}
	
	@Override
	public boolean insert(DomainObject cust) {
		// TODO Auto-generated method stub
		boolean result = false;
		Customer customer = (Customer) cust;
		PreparedStatement insertStatement = null;
		try {
			//customer table: 1,id 2,name 3,accountEmail 4,password 5,phoneNo
			insertStatement = DBConnection.prepare(insertCustomerStatementString);
			insertStatement.setInt(1, customer.getID());
			insertStatement.setString(2, customer.getName());
			insertStatement.setString(3, customer.getAccountEmail());
			insertStatement.setString(4, customer.getPassword());
			insertStatement.setString(5, customer.getPhoneNo());
			
			insertStatement.execute();
			result = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(DomainObject obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(DomainObject obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DomainObject queryWithID(int id) {
		Customer result = null;
		
		PreparedStatement findStatement = null;
		ResultSet rs = null;
		try {
			findStatement = DBConnection.prepare(findUserString);
			findStatement.setInt(1, id);
			rs = findStatement.executeQuery();
			System.out.println("query executed");
			//by applying global unique key for domain objects(Users), should only find one result
			if (rs.next()) {
				//TODO: Also Need to find the service list
				//resultServiceList = ServiceMapper.query(obj);
				result = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("accountemail")
						, rs.getString("password"), rs.getString("phoneno"), null);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;		
	}

}