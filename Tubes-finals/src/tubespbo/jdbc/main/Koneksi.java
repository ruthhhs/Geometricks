package jdbc.main;

import jdbc.utilities.MysqlUtility;
import java.sql.Connection;

public class Koneksi {
    public static void main(String[] args) {

        Connection conn = MysqlUtility.getConnection();

        if (conn != null) {
            System.out.println("Database sudah connect!");
        } else {
            System.out.println("Gagal connect!");
        }
        
        
        
    }
}