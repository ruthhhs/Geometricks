package tubespbo.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import tubespbo.model.Koleksi;
import tubespbo.model.SoalQuiz;

public class MysqlSoalQuizService {
    Connection koneksi = null;
    
    public MysqlSoalQuizService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    public Koleksi<SoalQuiz> getAllSoal() {
        Koleksi<SoalQuiz> listSoal = new Koleksi<>();
        try {
            String query = "SELECT * FROM soal_quiz";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
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