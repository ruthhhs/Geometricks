package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import jdbc.utilities.MysqlUtility;

public class MysqlService {

    Connection conn = MysqlUtility.getConnection();

    public void register(
            String id,
            String username,
            String password
    ) {

        try {

            String sql =
                    "INSERT INTO account VALUES (?, ?, ?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, id);
            ps.setString(2, username);
            ps.setString(3, password);

            ps.executeUpdate();

            System.out.println("Register berhasil");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}