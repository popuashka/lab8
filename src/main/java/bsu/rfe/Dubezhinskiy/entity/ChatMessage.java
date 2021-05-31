package bsu.rfe.Dubezhinskiy.lab8.entity;

import java.util.Date;
public class ChatMessage
{
    // Текст сообщения
    private String message;
    // Автор сообщения
    private ChatUser author;
    private Date calendar;
    // Временная метка сообщения (в микросекундах)
    private long timestamp;
    public ChatMessage(String message, ChatUser author, long timestamp, Date calendar)
    {
        super();
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
        this.calendar = calendar;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public ChatUser getAuthor() {
        return author;
    }
    public void setAuthor(ChatUser author) {
        this.author = author;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public Date getCertainTime() { return calendar; }
}