package bg.softuni.resellerapp.session;

import bg.softuni.resellerapp.model.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class LoggedUser {

    private long id;

    private String username;

    public void login(User user) {
        this.id = user.getId();
        this.username = getUsername();
    }

    public void logout() {
        this.id = 0;
        this.username = null;
    }

    public long getId() {
        return id;
    }

    public LoggedUser setId(long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public LoggedUser setUsername(String username) {
        this.username = username;
        return this;
    }
}
