import java.util.Scanner;

public class javaQlite {

    public static String parseInput(Scanner scanner) {
        String input = scanner.nextLine();
        if (input.trim().equals("{exit()}")) {
            System.exit(0);
        }
        return input;
    }

    
    
    public static void main(String[] args) {
        
        boolean running = false;

        Scanner scanner = new Scanner(System.in);
        
        while (running) {
            System.out.println("Welcome to the JavaQlite program. Please select an option from the menu below:");
            System.out.println("1. Create a new database");
            System.out.println("2. Create a new table");
            System.out.println("3. Insert data into a table");
            System.out.println("4. Select data from a table");
            System.out.println("5. Update data in a table");
            System.out.println("6. Delete data from a table");
            System.out.println("7. Delete a table");
            System.out.println("8. Delete a database");
            System.out.println("9: Run a custom query");
            System.out.println("0. Exit (Write {exit()} to exit the program at any time)");
            System.out.println("Please enter your selection: ");

            String input = parseInput(scanner);
            System.out.println("You entered: " + input);


            Connect connect = new Connect();
            connect.connect();
        }
    }
}
