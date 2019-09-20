package datasource;

import java.sql.*;

public class DBConnection {
	//For local setup, uncomment this line or, better, set the environment variable in your run configuration
	private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/MyUSR";
	//private static final String DB_CONNECTION = System.getenv().get("JDBC_DATABASE_URL");
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "Masterji1";
	
	public static PreparedStatement prepare(String stm) {
		PreparedStatement preparedStatement = null;
		try {
			Connection dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(stm);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return preparedStatement;
	}
	
	private static Connection getDBConnection() {
		try {
			//TODO: confused of next sentence. should it be manually called?
			//DriverManager.registerDriver(new org.postgresql.Driver());
			
			Connection dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Connection problem");
		return null;
	}
		
	public static PreparedStatement prepare(String stm, int returnGeneratedKeys) {
		PreparedStatement preparedStatement = null;
		try {
			Connection dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(stm,Statement.RETURN_GENERATED_KEYS);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return preparedStatement;
	}
	
}
