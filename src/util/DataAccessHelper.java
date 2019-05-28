package util;

import java.sql.*;

public class DataAccessHelper {
    public Connection conn = null;


    public void displayError(SQLException ex) {
        System.out.println("Error Message: " + ex.getMessage());
        System.out.println("Error state: " + ex.getSQLState());
        System.out.println("Error Code: " + ex.getErrorCode());
    }

    public void open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/qlrp","root","sasa");  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        }catch (SQLException ex) {
            displayError(ex);
        }
    }

    public ResultSet excuteQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException ex) {
            displayError(ex);
        }
        return rs;
    }

//    public static void main(String[] args) {
//        DataAccessHelper helper = new DataAccessHelper();
//        String sql = "SELECT * FROM NhanVien";
//        helper.open();
//        ResultSet rs = helper.excuteQuery(sql);
//        
//        try {
//            
//        while(rs.next()) {
//            System.out.println(rs.getString("MaNV"));
//            System.out.println(rs.getString("TenNV"));
//            
//        }
//        } catch(SQLException e) {
//            helper.displayError(e);
//        }
//        
//        
//        helper.close();
//    }
}
