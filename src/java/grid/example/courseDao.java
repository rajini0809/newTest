package grid.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class courseDao {

    public List courseadd() throws SQLException, Exception {
        Connection con;
        PreparedStatement pstmt;
        con = util.getConnection();
        ResultSet rs = null;
        List<courseBean> ad = new ArrayList();
        try {

            pstmt = con.prepareStatement("select id,ccourse from courses");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                courseBean course1 = new courseBean();
                course1.setId(rs.getInt("id"));
                course1.setCcourse(rs.getString("ccourse"));
                ad.add(course1);

            }

            return ad;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

}
