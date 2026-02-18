import java.io.Console;
public class HangmanDriver {
    public static void main(String args[]){
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
        console.println("Welcome to Hangman, " + name + "!");
    }
}
