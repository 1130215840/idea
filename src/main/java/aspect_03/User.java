package aspect_03;

public class User {
    private  int id;
    private String account;
    private String password;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
