package tubespbo.jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    private static Connection conn;

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/geometry_db";
            String user = "mahasiswa";
            String password = "rahasia";

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Koneksi berhasil");

        } catch (Exception e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
        }

        return conn;
    }
}