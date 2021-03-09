package day13;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User (String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        if (subscriptions.contains(user.getUsername())) return true;
        else return false;
    }
    public boolean isFriend(User user){
        if (this.isSubscribed(user)&& user.isSubscribed(this)) return true;
        else return false;
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user,text);
    }
    public String toString(){
        return this.username;
    }
}
