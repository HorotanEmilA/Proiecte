package horotan.emil.lab1.ex5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleMenu {private Dictionary dictionary;
    private Scanner scanner;

    public ConsoleMenu() {
        dictionary = new Dictionary();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Add a word and its definition");
            System.out.println("2. Get the definition of a word");
            System.out.println("3. Show all words");
            System.out.println("4. Show all definitions");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumă linia nouă

            switch (option) {
                case 1:
                    addWord();
                    break;
                case 2:
                    getDefinition();
                    break;
                case 3:
                    System.out.println(dictionary.getAllWords().keySet());
                    break;
                case 4:
                    dictionary.getAllDefinitions();
                    break;
                case 5:
                    return; // Închide aplicația
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private void addWord() {
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        System.out.print("Enter the definition: ");
        String definition = scanner.nextLine();

        dictionary.addWord(new Word(word), new Definition(definition));
    }

    private void getDefinition() {
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        Definition definition = dictionary.getDefinition(new Word(word));
        if (definition != null) {
            System.out.println("Definition: " + definition.getDescription());
        } else {
            System.out.println("Word not found!");
        }
    }

    public static void main(String[] args) {
        new ConsoleMenu().showMenu();
    }
}
