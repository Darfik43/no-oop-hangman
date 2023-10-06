import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String[] dictionary = {"order", "red", "door", "sure", "become", "top", "ship", "across", "today",
            "during", "short", "better", "best", "however", "low", "hours", "black", "products", "happened", "whole", "measure",
            "remember", "early", "waves", "reached"};
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
    private static String currentWord;
    private static int gameState = 0;


    public static void main(String[] args) {
        startOrQuit();
        int a = 123;
    }

    public static void startOrQuit() {
        System.out.println("Enter 1 to start the game, enter 2 to quit the game");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Game starts");
            String gameWord = setGameWord();
            startGameLoop(gameWord);
        } else if (input == 2) {
            System.exit(0);
        } else {
            System.out.println("Enter correct number");
        }
    }

    public static String setGameWord() {
        int index = random.nextInt(0, 25);
        String gameWord = dictionary[index];
        return gameWord;
    }

    public static void startGameLoop(String gameWord) {

        while (gameState < 6) {
            printGameState(gameState);
            inputLetter(gameWord);
            printCurrentWord(gameWord);
        }
        if (gameState == 6) {
            printGameState(gameState);
            gameState = 0;
            startOrQuit();
        }
    }

    public static void printGameState(int gameState) {
        switch (gameState) {
            case 0:
                System.out.println(HANGMAN_STATE_0);
                System.out.println("Mistakes = 0");
                break;
            case 1:
                System.out.println(HANGMAN_STATE_1);
                System.out.println("Mistakes = 1");
                break;
            case 2:
                System.out.println(HANGMAN_STATE_2);
                System.out.println("Mistakes = 2");
                break;
            case 3:
                System.out.println(HANGMAN_STATE_3);
                System.out.println("Mistakes = 3");
                break;
            case 4:
                System.out.println(HANGMAN_STATE_4);
                System.out.println("Mistakes = 4");
                break;
            case 5:
                System.out.println(HANGMAN_STATE_5);
                System.out.println("Mistakes = 5");
                break;
            case 6:
                System.out.println(HANGMAN_STATE_6);
                System.out.println("Game is over");
                break;
        }
    }

    public static boolean isLetterCorrect(String letter, String gameWord) {
        if (gameWord.contains(letter.toLowerCase())) {
            return true;
        } else {
            gameState++;
            return false;
        }
    }

    public static void inputLetter(String gameWord) {
        System.out.println("Enter your letter");
        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() > 1) {
                System.out.println("Enter one letter per turn");
            } else if (input.matches("[0-9!@#$%^&*()_\\-=+:;\\[\\]{}/<>~`?]")) {
                System.out.println("Enter the letter please");
            } else {
                isLetterCorrect(input, gameWord);
                break;
            }
        } while (true);
    }

    public static void printCurrentWord(String gameWord) {
    }
}