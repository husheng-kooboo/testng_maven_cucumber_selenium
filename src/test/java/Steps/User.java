package Steps;

import java.util.Map;

public class User {
    public String username;
    public String password;

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

    public static User createUser(Map<String, String> entry) {
        User user = new User();
        user.setUsername(entry.get("username"));
        user.setPassword(entry.get("password"));
        return user;
    }
}
