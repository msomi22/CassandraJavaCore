package test.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author t_pnjeru
 */
public class TEST2 {
    
    static Connection con = null;

    public static void main(String[] a) throws SQLException {
        String theAccount = "1203973187", valueString = "";
        String rmDAO = "";
        String branchDAO = "";
        con = getJdbcConnection();
        //GET DAO and RM from NOBS DB using try with resources 
        String daoRmQuery = "SELECT ACC.DEPARTMENT_ACCOUNT_OFFICER DAO, CUS.ACCOUNT_OFFICER RM FROM BNK_ACCOUNT ACC JOIN CUSTOMER CUS on  CUS.ID=ACC.CUSTOMER_ID WHERE ACC.ID = ?";
        try (PreparedStatement pstm = con.prepareStatement(daoRmQuery)) {
            pstm.setString(1, theAccount);
            System.out.println("***************************");
            try {
                ResultSet rst = pstm.executeQuery();
                while (rst.next()) {
                    rmDAO = rst.getString("DAO");
                    branchDAO = rst.getString("RM");
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception while quering BNK_ACCOUNT with account {} " + theAccount);
                System.out.println("SQL Exception {} " + e);
            }
        }
        if ("RMDAO".equalsIgnoreCase("RMDAO")) {
            valueString = rmDAO;
            System.out.println("rmDAO = " + rmDAO);
        } else {
            valueString = branchDAO;
            System.out.println("branchDAO = " + branchDAO);
        }
        System.out.println("--------------------" + valueString);
    }

    /**
     *
     * @return
     */
    public static Connection getJdbcConnection() {
        String dbURL;
        dbURL = "jdbc:oracle:thin:" + "@" + "172.17.80.40" + ":" + "1521" + ":" + "KNOB12";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(dbURL, "nobsdb", "nobsdb");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println("got connection " + con);
        return con;
    }

}
