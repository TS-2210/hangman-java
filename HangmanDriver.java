import java.io.Console;
public class HangmanDriver {
    public static void main(String args[]){
        Console console = System.console();
        Hangman hangman = new Hangman();
        String name = console.readLine("Enter your name: ");
        hangman.setPlayerName(name);
        console.printf("Welcome to Hangman, %s!", hangman.getPlayerName());
    }
}
