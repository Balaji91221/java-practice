import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Creating an admin, developer, and guest
        Admin admin = new Admin();
        Developer developer = new Developer();
        Guest guest = new Guest();

        System.out.println("Welcome to the App!");

        while (true) {
            System.out.println("Please select a user type:");
            System.out.println("1. Admin");
            System.out.println("2. Developer");
            System.out.println("3. Guest");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    admin.adminTask();
                    break;
                case 2:
                    developer.developerTask();
                    break;
                case 3:
                    guest.guestTask();
                    break;
                case 4:
                    System.out.println("Exiting the App. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class User {
    public void commonTask() {
        System.out.println("Common task for all users.");
    }
}

class Admin extends User {
    public void adminTask() {
        System.out.println("Performing admin task.");
        manageData();
        readData();
        writeData();
        // Admin-specific tasks
    }
    public void readData() {
        System.out.println("Reading admin data...");
        // Add your code to read admin-specific data from a file or database
    }
    public void writeData() {
        System.out.println("Writing admin data...");
        // Add your code to write admin-specific data to a file or database
    }

    public void manageData() {
        System.out.println("Managing admin data...");
        // Add your code to manage admin-specific data
    }
}

class Developer extends User {
    public void developerTask() {
        System.out.println("Performing developer task.");
        readData();
        writeData();
        // Developer-specific tasks
    }

    private void readData() {
        System.out.println("Reading developer data...");
        // Add your code to read developer-specific data from a file or database
    }

    private void writeData() {
        System.out.println("Writing developer data...");
        // Add your code to write developer-specific data to a file or database
    }
}

class Guest extends User {
    public void guestTask() {
        System.out.println("Performing guest task.");
        readData();
        // Guest-specific tasks
    }

    private void readData() {
        System.out.println("Reading guest data...");
        // Add your code to read guest-specific data from a file or database
    }
}
