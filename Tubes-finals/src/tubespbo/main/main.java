package tubespbo.main;

import tubespbo.service.MysqlUtility;
import tubespbo.view.MainMenu;

import java.sql.Connection;

public class main {
    public static void main(String[] args) {

        // cek koneksi database
        Connection conn = MysqlUtility.getConnection();

        if (conn != null) {
            System.out.println("Database sudah connect!");
        } else {
            System.out.println("Gagal connect!");
        }

        // jalankan aplikasi GUI
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }
}
