package tubespbo.jdbc.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import tubespbo.model.Koleksi;
import tubespbo.model.SoalQuiz;

public class MysqlSoalQuizService {
    public Koleksi<SoalQuiz> getAllSoal() {
        Koleksi<SoalQuiz> listSoal = new Koleksi<>();
        try {
            Connection conn = MysqlUtility.getConnection();
            String sql = "SELECT * FROM soal_quiz";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                SoalQuiz soal = new SoalQuiz(
                    rs.getInt("id_soal"),
                    rs.getString("pertanyaan"),
                    rs.getString("opsi_a"),
                    rs.getString("opsi_b"),
                    rs.getString("opsi_c"),
                    rs.getString("opsi_d"),
                    rs.getString("jawaban")
                );
                listSoal.add(soal);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return listSoal;
    }
}