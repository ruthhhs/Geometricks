package tubespbo.main;

import tubespbo.model.Account;
import tubespbo.model.HasilQuiz;
import tubespbo.service.MysqlService;
import tubespbo.service.MysqlHasilQuizService;
import java.math.BigDecimal;

public class Program {

    static MysqlService accountService = new MysqlService();
    static MysqlHasilQuizService quizService = new MysqlHasilQuizService();

    public static void main(String[] args) {

        // ======================
        // INSERT ACCOUNT
        // ======================
        System.out.println("=== INSERT ACCOUNT ===");

        Account acc = new Account("A2001", "budi", "1234");
        accountService.add(acc);

        System.out.println("berhasil insert: " + acc);


        // ======================
        // INSERT HASIL QUIZ
        // ======================
        System.out.println("\n=== INSERT HASIL QUIZ ===");

        HasilQuiz hq = new HasilQuiz(
                "H001",
                "A2001",
                new BigDecimal("95.50"),
                120
        );

        quizService.add(hq);

        System.out.println("berhasil insert: " + hq);


        // ======================
        // UPDATE ACCOUNT
        // ======================
        System.out.println("\n=== UPDATE ACCOUNT ===");

        acc.setPassword("9999");
        accountService.update(acc);

        System.out.println("berhasil update: " + acc);


        // ======================
        // DELETE HASIL QUIZ
        // ======================
        System.out.println("\n=== DELETE HASIL QUIZ ===");

        quizService.delete("H001");

        System.out.println("berhasil delete H001");


        // ======================
        // GET ALL ACCOUNT
        // ======================
        System.out.println("\n=== LIST ACCOUNT ===");

        for (Account a : accountService.getAll()) {
            System.out.println(a.getIdAccount() + " | " + a.getUsername());
        }


        // ======================
        // GET ALL HASIL QUIZ
        // ======================
        System.out.println("\n=== LIST HASIL QUIZ ===");

        for (HasilQuiz h : quizService.getAll()) {
            System.out.println(
                    h.getIdHasil() + " | " +
                    h.getIdAccount() + " | " +
                    h.getNilai() + " | " +
                    h.getWaktu()
            );
        }
    }
}