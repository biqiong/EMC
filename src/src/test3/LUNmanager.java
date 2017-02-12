package src.test3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LUNmanager {

    public static boolean insertLUN(LUN lun) throws Exception {
        String LunId = lun.getId();
        try {
            String sql = "insert into LUN(id,size,export) values(?,?,?)";
            Connection conn = Conn.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, LunId);
            pstmt.setInt(2, 0);
            pstmt.setBoolean(3, false);
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateLUN(LUN lun) throws Exception {
        try {
            String sql = "update LUN set size=?,export=? where id=?";
            Connection conn = Conn.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, lun.getSize());
            pstmt.setBoolean(2, lun.getExport());
            pstmt.setString(3, lun.getId());
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteLUN(LUN lun) throws Exception {
        try {
            String sql = "delete from LUN where id=?";
            Connection conn = Conn.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, lun.getId());
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public static LUN getLUN(String LunId) throws Exception {
        try {
            String sql = "select size,export from LUN where id=?";
            Connection conn = Conn.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, LunId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                LUN LunNew = new LUN();
                LunNew.setId(LunId);
                LunNew.setSize(rs.getInt(1));
                LunNew.setExport(rs.getBoolean(2));
                return LunNew;
            } else {
                return null;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}
