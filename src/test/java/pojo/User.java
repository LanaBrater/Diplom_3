package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String email;
    private String password;
    private String name;

    public User() {
    }

    @Override
    public String toString() {
        return "email: " + email + ", password: " + password + ", name: " + name;
    }
}