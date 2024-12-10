package DAO;

import ConnectDB.JDBCConnect;
import Model.CaPhe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;


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
                CaPhe cp = new CaPhe(res.getString("MACAPHE") , res.getString("MADANHMUC"), res.getString("TENCAPHE"), res.getBytes("ANHMINHHOA"), res.getInt("DONGIA"));
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
    public static void insert(CaPhe cp){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnect.getConnection();
            String sql = "INSERT INTO CAPHE VALUES (?, ?, ?, ?, ?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, cp.getMaCaPhe());
            pre.setString(2,cp.getMaDanhMuc());
            pre.setString(3,cp.getTenCaPhe());
            pre.setBytes(4, cp.getAnhMinhHoa());
            pre.setInt(5,cp.getDonGia());
            
            int rowsAffected = pre.executeUpdate(); // Kiểm tra số dòng bị ảnh hưởng

            if (rowsAffected > 0) {
                // Thêm thành công
                JOptionPane.showMessageDialog(null, "Thêm cà phê thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Thêm thất bại
                JOptionPane.showMessageDialog(null, "Thêm cà phê thất bại. Vui lòng thử lại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            
      
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex);
        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
        }
    }
    
   
     
}