package PM.login.model;

/**
 *
 * @author andreendo
 */
public class User {
    private String username, password;
    private UserType type;
    private boolean status;
    
    public User(String username, String password, UserType type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public User(String user, String normal, UserType userType, boolean b) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.status = b;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public UserType getType() {
        return type;
    }   

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
