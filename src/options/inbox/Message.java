package options.inbox;

import java.util.Date;

public class Message {
    private String sender, recipient, subject, body;
    private Date receivedDate;
    private boolean isRead = false;

    public Message(String sender, String recipient, String subject, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.receivedDate = new Date();  // Auto-assign current time
    }

    public void markAsRead() { this.isRead = true; }

    @Override
    public String toString() {
        return String.format("From: %s\nSubject: %s\nReceived: %s\nRead: %b\nMessage: %s",
                sender, subject, receivedDate, isRead, body);
    }

    public boolean isRead() { return isRead; }
    public String getBody() { return body; }
    public String getSubject() { return subject; }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
}
