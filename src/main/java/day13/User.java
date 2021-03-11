package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user.getUsername());
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return this.username;
    }
}
