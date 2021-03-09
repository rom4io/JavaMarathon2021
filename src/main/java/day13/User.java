package day13;

import java.security.PublicKey;
import java.util.List;

public class User {
    String username;
    List subscriptions;

    public User (String username, List subscriptions){
        this.username = username;
        this.subscriptions = subscriptions;
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
        if (subscriptions.contains(user)) return true;
        else return false;
    }
    public boolean isFriend(User user){
        if (user.subscriptions.contains(username)) return true;
        else return false;
    }
    public void sendMessage(User user, String text){

    }
    public String toString(){
        return this.username;
    }
}
