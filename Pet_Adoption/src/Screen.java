import java.util.List;
import java.util.Scanner;

public class Screen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Log In");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void showAdminMenu() {
        System.out.println("=== Admin Menu ===");
        System.out.println("1. Manage User Profiles on System");
        System.out.println("2. Pet Management");
        System.out.println("3. Addopter Management");
        System.out.println("4. Shelter Management");
        System.out.println("5. Adoption Process Management");
        System.out.println("6. Notification Management");
        System.out.println("7. Reporting and Analytics");
        System.out.println("8. Log Out");
        System.out.print("Enter your choice: ");
    }

    public static void showAdopterMenu() {
        System.out.println("=== Adopter Menu ===");
        System.out.println("1. manage profile");
        System.out.println("2. Pet Exploration");
        System.out.println("3. Adoption Process");
        System.out.println("4. Notifications");
        System.out.println("5. Adoption History");
        System.out.println("6. Log Out");
        System.out.print("Enter your choice: ");
    }

    public static String getInput(String message) {
        System.out.print(message);
        String input;
        do {
            input = scanner.next().trim();
            if (input.isEmpty()) {
                System.out.print("Input cannot be empty. " + message + " ");
            }
        } while (input.isEmpty());
        return input.trim();
    }

    public static int getIntInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void displayPets(List<Pet> pets) {
        for (Pet pet : pets) {
            pet.displayPetDetails();
        }
    }
}
