package options.inbox;

import java.util.ArrayList;
import java.util.List;

// Inbox class
public class Inbox {
    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessages() {
        if (messages.isEmpty()) {
            System.out.println("Inbox is empty.");
        } else {
            messages.forEach(m -> System.out.println(m + "\n---"));
        }
    }

    public void markAsRead(int index) {
        if (isValidIndex(index)) {
            messages.get(index).markAsRead();
        }
    }

    public void deleteMessage(int index) {
        if (isValidIndex(index)) {
            messages.remove(index);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < messages.size();
    }
}
