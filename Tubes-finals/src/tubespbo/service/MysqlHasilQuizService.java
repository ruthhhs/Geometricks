package tubespbo.jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tubespbo.model.HasilQuiz;

public class MysqlHasilQuizService {
    Connection koneksi = null;
    public MysqlHasilQuizService() {
        koneksi = MysqlUtility.getConnection();
    }

    // =====================
    // INSERT
    // =====================
    public void add(HasilQuiz hq) {
        try {
            String query = "INSERT INTO hasil_quiz (id_hasil, id_account, nilai, waktu) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setInt(1, hq.getIdHasil());
            ps.setInt(2, hq.getIdAccount());
            ps.setFloat(3, hq.getNilai());
            ps.setInt(4, hq.getWaktu());

            ps.executeUpdate();
            System.out.println("Berhasil insert hasil quiz");

        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // =====================
    // UPDATE
    // =====================
    public void update(HasilQuiz hq) {
        try {
            String query = "UPDATE hasil_quiz SET id_account=?, nilai=?, waktu=? WHERE id_hasil=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setInt(1, hq.getIdAccount());
            ps.setFloat(2, hq.getNilai());
            ps.setInt(3, hq.getWaktu());
            ps.setInt(4, hq.getIdHasil());

            ps.executeUpdate();
            System.out.println("Berhasil update hasil quiz");

        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // =====================
    // DELETE
    // =====================
    public void delete(String idHasil) {
        try {
            String query = "DELETE FROM hasil_quiz WHERE id_hasil=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, idHasil);

            ps.executeUpdate();
            System.out.println("Berhasil delete hasil quiz");

        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // =====================
    // GET BY ID
    // =====================
    public HasilQuiz getById(String idHasil) {
        HasilQuiz hq = null;

        try {
            String query = "SELECT * FROM hasil_quiz WHERE id_hasil=?";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, idHasil);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                hq = new HasilQuiz(
                    rs.getInt("id_account"),
                    rs.getFloat("nilai"),
                    rs.getInt("waktu")
                );
            }

        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }

        return hq;
    }

    // =====================
    // GET ALL
    // =====================
    public List<HasilQuiz> getAll() {

        List<HasilQuiz> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM hasil_quiz";
            Statement st = koneksi.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new HasilQuiz(
                    rs.getInt("id_account"),
                    rs.getFloat("nilai"),
                    rs.getInt("waktu")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }

        return list;
    }
}