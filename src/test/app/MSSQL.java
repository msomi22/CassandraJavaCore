package test.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MSSQL {

	public MSSQL() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///KCBSYBTEST2014
		
		//"jdbc:jtds:sqlserver://<your server ip address>:1433/zacmpf", userName, password 
		
		Sybrin("jdbc:sqlserver://172.16.4.18:1433/KCBSYBTEST2014", "t_pnjeru","123456789");

	}
	
	public static void Sybrin(String db_connect_string,String db_userid,String db_password) {
		try {
	         //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         //Connection conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);
	         
	         //Class.forName("net.sourceforge.jtds.jdbc.Driver" );
	         //Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.16.4.18:1433/KCBSYBTEST2014", "t_pnjeru","123456789");
	      
	         
	         String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	         Class.forName(driver);
	         String server = "172.16.4.18";
	         String port = "1433";
	         String dbName = "KCBSYBTEST2014";
	         String user = "t_pnjeru";
	         String password = "123456789";

	         String url="jdbc:odbc:;DRIVER={SQL Server};SERVER="+server+","+port+";DATABASE="+dbName;
	         Connection   conn = DriverManager.getConnection(url,user,password);
	         
	        
	         System.out.println("connected");
	         Statement statement = conn.createStatement();
	         String queryString = "select * from sysobjects where type='u'";
	         ResultSet rs = statement.executeQuery(queryString);
	         while (rs.next()) {
	            System.out.println(rs.getString(1));
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
