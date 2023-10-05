import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String[] dictionary = {"order", "red", "door", "sure", "become", "top", "ship", "across", "today",
            "during", "short", "better", "best", "however", "low", "hours", "black", "products", "happened", "whole", "measure",
            "remember", "early", "waves", "reached"};
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static String HANGMAN_STATE_0 = " +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_1 = "+---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_2 = "+---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_3 = "+---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_4 = "+---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_5 = " +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========";
    private static String HANGMAN_STATE_6 = "+---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "=========";

    private static String gameWord;
    private static String currentWord;
    private static int mistakes = 0;


    public static void main(String[] args) {
//        startOrQuit();
        setGameWord();
        int a = 123;
    }

    public static void startOrQuit() {
        System.out.println("Enter 1 to start the game, enter 2 to quit the game");
        int input = scanner.nextInt();

        if (input == 1) {
            // startGame
        } else if (input == 2) {
            System.exit(0);
        } else {
            System.out.println("Enter correct number");
        }
    }

    public static void setGameWord() {
        int index = random.nextInt(0, 25);
        gameWord = dictionary[index];
    }
    public static void startGameLoop(String gameWord) {
        int gameState = 0;

        while (gameState < 6) {

        }
    }
}