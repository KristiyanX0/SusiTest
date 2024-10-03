import options.inbox.Inbox;

import java.util.Scanner;
// NOT FINISHED AT ALL
public class Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n1. View Messages");
            System.out.println("2. Enroll in Elective");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    boolean viewingMessages = true;

                    while (viewingMessages) {
                        System.out.println("\nInbox:");
                        inbox.displayMessages();

                        System.out.println("Enter message number to view, or 0 to go back:");
                        int messageChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (messageChoice == 0) {
                            viewingMessages = false;
                        } else if (messageChoice > 0 && messageChoice <= inbox.size()) {
                            System.out.println("\nMessage:");

                            System.out.println("---");
                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 2:
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}