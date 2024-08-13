package adapter;

import model.User;

public class UserAdapter {
    private User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    public int getUserId() {
        return user.getId();
    }

    public String getUserName() {
        return user.getName();
    }

    public String getUserEmail() {
        return user.getEmail();
    }
}





