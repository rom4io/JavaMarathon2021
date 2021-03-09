package day13;

import java.util.Date;

public class Message {

    User sender;
    User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = date;
    }
}
