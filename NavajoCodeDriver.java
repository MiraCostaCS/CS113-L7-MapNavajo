import java.util.Scanner;

public class NavajoCodeDriver{
    public static void main(String[] args) {
        NavajoCodeMap navajoCodeMap = new NavajoCodeMap();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Navajo Code Lab!");
        System.out.println("Learn about the heroic Navajo Code Talkers, who created an unbreakable code during World War II.");
        System.out.println("-------------------------------------------------------------");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Learn a fact about the Code Talkers");
            System.out.println("2. Encode a message into Navajo");
            System.out.println("3. Decode a Navajo message");
            System.out.println("4. Display code mappings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println(getRandomFact());
                    break;

                case 2:
                    System.out.print("Enter an English phrase to encode: ");
                    String englishText = scanner.nextLine();
                    String encodedMessage = navajoCodeMap.encodeToNavajo(englishText);
                    System.out.println("Encoded Navajo Message: " + encodedMessage);
                    break;

                case 3:
                    System.out.print("Enter a Navajo phrase to decode: ");
                    String navajoText = scanner.nextLine();
                    String decodedMessage = navajoCodeMap.decodeToEnglish(navajoText);
                    System.out.println("Decoded English Message: " + decodedMessage);
                    break;

                case 4:
                    navajoCodeMap.displayLetterToWordTable();
                    System.out.println("\n");
                    navajoCodeMap.displayNavajoTable();
                    break;

                case 5:
                    System.out.println("Thank you for exploring the Navajo Code Talkers' legacy. See you next time!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static String getRandomFact() {
        String[] facts = {
                "The Navajo Code Talkers used over 600 Navajo words for military terms.",
                "During WWII, about 400 Navajo men served as Code Talkers.",
                "The Navajo language was ideal for coding because it was unwritten and complex.",
                "The Code Talkers were key in the U.S. victory at Iwo Jima."
        };
        int randomIndex = (int) (Math.random() * facts.length);
        return facts[randomIndex];
    }
}
