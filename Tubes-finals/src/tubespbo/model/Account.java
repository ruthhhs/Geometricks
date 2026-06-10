package tubespbo.model;

public class Account {
    // ====== ATRIBUT ======
    private int idAccount;
    private String username;
    private String password;
    
    // ====== KONTRUKTOR ======
    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Account(int idAccount, String username, String password) {
        this.idAccount = idAccount;
        this.username = username;
        this.password = password;
    }

    // ====== SELEKTOR ======
    public int getIdAccount() {
        return idAccount;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    // ====== MUTATOR ======
    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}