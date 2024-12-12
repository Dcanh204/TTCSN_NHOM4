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
                CaPhe cp = new CaPhe(res.getString("MACAPHE"), res.getString("TENCAPHE"), res.getBytes("ANHMINHHOA"), res.getInt("DONGIA"));
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
    public static boolean insert(CaPhe cp){
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
            
            pre.executeUpdate(); 
            return true;
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex);
            return false;
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
    
    public static boolean update(CaPhe cp){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnect.getConnection();
            String sql = "UPDATE CAPHE SET TENCAPHE = ?, DONGIA = ?, ANHMINHHOA = ? WHERE MACAPHE = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, cp.getTenCaPhe());
            pre.setInt(2,cp.getDonGia());
            pre.setBytes(3, cp.getAnhMinhHoa());
            pre.setString(4, cp.getMaCaPhe());
            
            pre.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
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
    
    public static boolean delete(String maCP){
        Connection conn = null;
        PreparedStatement pre = null;
        
        try {
            conn = JDBCConnect.getConnection();
            String sql = "DELETE FROM CAPHE WHERE MACAPHE = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, maCP);
            
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error" +  e);
            return false;
        }finally{
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
                } catch (SQLException ex2) {
                    System.out.println("Error" + ex2);
                }
            }
        }
    }
    
    public static List<CaPhe> findByTenCP(String tenCP){
        List<CaPhe> cpList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet res;
        
        try {
            conn = JDBCConnect.getConnection();
            String sql = "SELECT * FROM CAPHE WHERE TENCAPHE LIKE ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1 , "%"+tenCP+"%");
            res = pre.executeQuery();
            
            while(res.next()){
                CaPhe cp = new CaPhe(res.getString("MACAPHE"), res.getString("TENCAPHE"), res.getBytes("ANHMINHHOA"), res.getInt("DONGIA"));
                cpList.add(cp);
            }
            
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }finally{
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
                } catch (SQLException ex2) {
                    System.out.println("Error" + ex2);
                }
            }
        }
        return cpList;
    }
     
}