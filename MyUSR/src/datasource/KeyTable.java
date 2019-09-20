package datasource;

import java.sql.ResultSet;

public class KeyTable {
	
	public int getKey(String tableName) {
		//get the next key from the table
		//String query = "SELECT nextID FROM keys WHERE name = {0} FOR UPDATE";
		//String queryPrepared = DB.prepare(query, tableName);
		//IDbCommand comm = new OleDbCommand(queryPrepared, DB.Connection);
		//ResultSet rs = comm.executeReader();
		//Record record = rs.get(0);
		//int result = record.getLong(1);
		
		//update the table with the next key
		//int nextKey = result + 1;
		//String update = "UPDATE keys SET nextID = {0} WHERE name = {1}";
		//String updatePrepared = DB.prepare(update, nextKey, tableName);
		//comm = new OleDbCommand(queryPrepared, DB.Connection);
		//comm.executeNonQuery();
		//return result;
		return 0;
	}
}
