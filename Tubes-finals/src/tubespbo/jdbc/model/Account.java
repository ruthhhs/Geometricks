package tubespbo.jdbc.model;

public class Account {

    private String idAccount;
    private String username;
    private String password;

    public Account() {
    }
    
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Account(String idAccount, String username, String password) {
        this.idAccount = idAccount;
        this.username = username;
        this.password = password;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}