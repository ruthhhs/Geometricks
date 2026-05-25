package tubespbo.jdbc.service;

import tubespbo.jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tubespbo.jdbc.model.Account;

public class MysqlService {

    Connection koneksi = null;

    public MysqlService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Account makeAccountObject() {
        return new Account();
    }

    // =====================
    // INSERT
    // =====================
    public void add(Account acc) {
        try {
            String query = "INSERT INTO account (id_account, username, password) VALUES (?, ?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, acc.getIdAccount());
            ps.setString(2, acc.getUsername());
            ps.setString(3, acc.getPassword());

            ps.executeUpdate();
            System.out.println("Berhasil insert account");

        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // =====================
    // UPDATE
    // =====================
    public void update(Account acc) {
        try {
            String query = "UPDATE account SET username=?, password=? WHERE id_account=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setString(3, acc.getIdAccount());

            ps.executeUpdate();
            System.out.println("Berhasil update account");

        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // =====================
    // DELETE
    // =====================
    public void delete(String idAccount) {
        try {
            String query = "DELETE FROM account WHERE id_account=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, idAccount);

            ps.executeUpdate();
            System.out.println("Berhasil delete account");

        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // =====================
    // GET BY ID
    // =====================
    public Account getById(String idAccount) {
        Account acc = null;

        try {
            String query = "SELECT * FROM account WHERE id_account=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, idAccount);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                acc = new Account(
                    rs.getString("id_account"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }

        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }

        return acc;
    }

    // =====================
    // GET ALL
    // =====================
    public List<Account> getAll() {

        List<Account> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM account";
            Statement st = koneksi.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new Account(
                    rs.getString("id_account"),
                    rs.getString("username"),
                    rs.getString("password")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }

        return list;
    }
    
    // =====================
    // METHOD TAMBAHAN UNTUK LOGIN
    // =====================
    
    // Cek login berdasarkan username dan password
    public boolean login(String username, String password) {
        boolean isValid = false;
        try {
            String query = "SELECT * FROM account WHERE username=? AND password=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                isValid = true;
                System.out.println("Login berhasil untuk user: " + username);
            } else {
                System.out.println("Login gagal: username/password salah");
            }
        } catch (SQLException e) {
            System.out.println("Gagal login: " + e.getMessage());
        }
        return isValid;
    }
    
    // Cek apakah username sudah terdaftar
    public boolean isUsernameExist(String username) {
        boolean exist = false;
        try {
            String query = "SELECT COUNT(*) AS jumlah FROM account WHERE username=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                exist = rs.getInt("jumlah") > 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal cek username: " + e.getMessage());
        }
        return exist;
    }
    
    // Mendapatkan account berdasarkan username
    public Account getAccountByUsername(String username) {
        Account acc = null;
        try {
            String query = "SELECT * FROM account WHERE username=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                acc = new Account(
                    rs.getString("id_account"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }
        } catch (SQLException e) {
            System.out.println("Gagal get account: " + e.getMessage());
        }
        return acc;
    }
    
    // Update password berdasarkan username
    public void updatePasswordByUsername(String username, String newPassword) {
        try {
            String query = "UPDATE account SET password=? WHERE username=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, username);
            ps.executeUpdate();
            System.out.println("Password berhasil diupdate untuk user: " + username);
        } catch (SQLException e) {
            System.out.println("Gagal update password: " + e.getMessage());
        }
    }
}