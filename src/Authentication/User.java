package Authentication;

import java.util.UUID;

public class User {

    private UUID id;
    private String username;
    private String password;
    private String email;

    public User(UUID id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoggedUser login(){
        if(this.username.equals("admin") && this.password.equals("admin") && this.email.equals("admin@admin")){
            return new LoggedUser(this.id, this.username, this.password, this.email);
        }
        else{
            System.out.println("usuário Comum");
            return null;
        }
    }
}
