
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dinh Canh
 */
public class JDBCConnect {
    public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QlyCafe;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "123456789";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Không load được driver");
        } catch (SQLException ex) {
            System.out.println("Khong ket noi duoc");
        }   
        return null;
    }
    public static void main(String[] args) {
        Connection conn = getConnection();
        
        if (conn != null) {
            System.out.println("Ket noi thanh cong");
        } else {
            System.out.println("Ket noi that bai");
        }
    }
   
}
