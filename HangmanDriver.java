import java.io.Console;
public class HangmanDriver {
    public static void main(String args[]){
        Console console = System.console();
        HangmanDictionary dictionary = new HangmanDictionary();
        String name = console.readLine("Enter your name: ");
        Hangman hangman = new Hangman(name);
        String word = dictionary.getWord();
        hangman.setWord(word);
        hangman.tryChar('a');
        hangman.tryChar('e');
        hangman.tryChar('i');
        hangman.tryChar('o');
        hangman.tryChar('u');
        console.printf("Welcome to Hangman, %s!", hangman.getPlayerName());
        System.out.println();
        console.printf("Word to guess: %s", hangman.getWord());
        System.out.println();
        console.printf("Current state: %s", hangman.getCurrentState());
    }
}
