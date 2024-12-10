
package DAO;

import ConnectDB.JDBCConnect;
import Model.CaPhe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class CaPheDAO {
    public static List<CaPhe> getAll(){
        List<CaPhe> cpList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet res;
        
        try {
            conn = JDBCConnect.getConnection();
            String sql = "SELECT * FROM CAPHE";
            pre = conn.prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                CaPhe cp = new CaPhe(res.getString("MACAPHE") , res.getString("TENCAPHE"), res.getBytes("ANHMINHHOA"), res.getInt("DONGIA"), res.getString("MADANHMUC"));
                cpList.add(cp);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            if(pre != null){
                try {
                    pre.close();
                } catch (SQLException ex1) {
                    System.out.println("Error" + ex1);
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex1) {
                    System.out.println("Error" + ex1);
                }
            }
        }
        return cpList;
    }
    
    
    
}
