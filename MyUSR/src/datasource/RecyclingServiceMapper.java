package datasource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.DomainObject;
import domain.RecyclingService;
import domain.Service;

public class RecyclingServiceMapper implements DataMapper { 
	
	private static final String INSERT_SERVICE = "INSERT INTO service VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static final String QUERY_SERVICE = "SELECT * FROM service WHERE serviceType = Recycling";
	
	public static RecyclingServiceMapper getThisClass() {
		return new RecyclingServiceMapper();
		
	}
	
	@Override
	public boolean insert(DomainObject service) {
		RecyclingService recyclingService = (RecyclingService) service;
		
		boolean result = false;
		PreparedStatement insertStatement = null;
		try {
			// Recycling table
			insertStatement = DBConnection.prepare(INSERT_SERVICE);
			// ID
			insertStatement.setInt(1, recyclingService.getID());
			// ServiceID
			insertStatement.setString(2, recyclingService.getCustomerAccountName());
			// UserID
			insertStatement.setString(3, recyclingService.getAdminAccountName());
			
			insertStatement.setInt(4, recyclingService.getServiceID());
			
			insertStatement.setString(5, recyclingService.getAddress());
			insertStatement.setString(6, recyclingService.getBookingDateTime());
			insertStatement.setString(7, recyclingService.getStatus().toString());
			insertStatement.setString(8, "null");
			insertStatement.setString(9, "null");
			insertStatement.setInt(10, recyclingService.applyRecyclingPolicy());
			insertStatement.setString(11, recyclingService.getServiceDescription());
			insertStatement.setString(12, recyclingService.getProgressDescription());
			insertStatement.setString(13, recyclingService.getAssignedStaff());
			insertStatement.setString(14, "Null");
			insertStatement.setString(15, "Null");
			insertStatement.setString(16, "Null");
			insertStatement.setString(17, "Recycling");
			
			insertStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return result;
	}

	@Override
	public boolean update(DomainObject service) {
		int billAmount = ((RecyclingService) service).applyRecyclingPolicy();
		String sql = "UPDATE";
		//String sqlPrepared = DB.prepare(sql);
		//IDBCommand comm = new OleDbCommand(sqlPrepared, DB.Connection);
		//comm.executeNonQuery();
		return false;
	}

	@Override
	public boolean delete(DomainObject service) {
		return false;
	}

	@Override
	public DomainObject queryWithID(int id) {
		
		RecyclingService recyclingService = null;
		
		PreparedStatement selectStatement = null;
		
		try {
			selectStatement = DBConnection.prepare(QUERY_SERVICE);
			selectStatement.setInt(1, id);
			
			ResultSet resultSet = selectStatement.executeQuery();
			System.out.println("query executed");
			while(resultSet.next()) {
				int ID = resultSet.getInt("ID");
				int serviceID = resultSet.getInt("serviceID");
				int userID = resultSet.getInt("userID");
				String address = resultSet.getString("address");
				String bookingDateTime = resultSet.getString("bookingDateTime");
				String status = resultSet.getString("status");
				String startDate = resultSet.getString("startDate");
				String endDate = resultSet.getString("endDate");
				int billAmount = resultSet.getInt("billAmount");
				String serviceDescription = resultSet.getString("serviceDescription");
				String progressDescription = resultSet.getString("progressDescription");
				String assignedStaff = resultSet.getString("assignedStaff");
				String recoveryItems = resultSet.getString("recoveryItems");
				String itemToDestroy = resultSet.getString("itemToDestroy");
				String itemDestroyed = resultSet.getString("itemDestroyed");
				String serviceType = resultSet.getString("serviceType");
				
				//recyclingService = new RecyclingService(customerAccountName, adminAccountName, serviceID, address, bookingDateTime, status, serviceDescription, progressDescription, assignedStaff))
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recyclingService;
	}

}
