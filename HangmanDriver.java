import java.io.Console;
public class HangmanDriver {
    public static void main(String args[]){
        Console console = System.console();
        HangmanDictionary dictionary = new HangmanDictionary();
        String name = console.readLine("Enter your name: ");
        Hangman hangman = new Hangman(name);
        String word = dictionary.getWord();
        hangman.setWord(word);
        console.printf("Welcome to Hangman, %s!", hangman.getPlayerName());
        System.out.println();
        console.printf("Word to guess: %s", hangman.getWord());
        System.out.println();
        do {
            char guess = console.readLine("Enter your guess: ").charAt(0);
            if(hangman.tryChar(guess)){
                console.printf("Correct! %s is in the word.", guess); 
            }
            else {
                console.printf("Incorrect! %s is not in the word.", guess);
            }
            System.out.println();
            console.printf("Current state: %s", hangman.getCurrentState());
            System.out.println();
            console.printf("Remaining guesses: %d", hangman.getRemainingGuesses());
            System.out.println();
        }
        while(hangman.getRemainingGuesses() > 0 && !hangman.getCurrentState().equals(hangman.getWord()));
        if(hangman.getCurrentState().equals(hangman.getWord())) {
            console.printf("Congratulations, %s! You guessed the word: %s", hangman.getPlayerName(), hangman.getWord());
        }
        else {
            console.printf("Game over, %s! The word was: %s", hangman.getPlayerName(), hangman.getWord());
    }
}
}
