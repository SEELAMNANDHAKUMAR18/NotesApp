import java.io.*;
import java.util.Scanner;

public class NotesApp {

    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNote(scanner);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add note using FileWriter (Append mode)
    private static void addNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + "\n");
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    // View notes using BufferedReader
    private static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Your Notes ---");

            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No notes found yet.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
