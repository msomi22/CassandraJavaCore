package db.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MSSERVER {
	public static String JDBC_URL = "jdbc:sqlserver://172.16.4.18\\KCBSYBTEST2014;databaseName=SYBKENKCB;integratedSecurity=false";
	public static Connection connObj = null;

	public MSSERVER() {

	}

	public static void main(String[] args) throws SQLException { 
		System.out.println("**********************"); 
		getDbConnection();
		System.out.println("**********************"); 
		selectQuery();
		//.index 7 = date  idx7

	}

	/**
	 * @throws SQLException
	 */
	private static void selectQuery() throws SQLException {
		ResultSet rset = null;
		String query = "select idx1,idx2,idx3,idx4,idx7,idx16,idx17,idx38,idx40 from day2 where idx40 = ?";
		try(PreparedStatement stmt = connObj.prepareStatement(query);  ) {
			stmt.setString(1, "005241526131"); 
			rset = stmt.executeQuery();
			while (rset.next()) {
				int fetchSize = 9;
				System.out.println("Fetch size " + fetchSize); 
				for(int i=1;i<fetchSize;i++) {
					String item = rset.getString(i);
					if(!item.isEmpty())
					  System.out.println("Item  = " + i + " value " + item)
					  ;  
				}


			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	public static Connection getDbConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connObj = DriverManager.getConnection(JDBC_URL,"t_pnjeru","123456789");
			if(connObj != null) {
				DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
				System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
				return connObj;
			}
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return connObj;
	}

}
