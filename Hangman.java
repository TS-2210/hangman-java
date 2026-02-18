public class Hangman {
    private String playerName;
    private String wordToGuess;
    final public int MAX_GUESSES = 20;
    private char[] guesses = new char[MAX_GUESSES];
    public Hangman(String playerName) {
        this.playerName = playerName;
    }
    
    public String getCurrentState() {
        String currentState = "";
        boolean found = false;
        for(char c : this.getWord().toCharArray()) {
            for(char g : this.getGuesses()) {
                if (c==g) {
                    currentState += c;
                    found = true;
                    break;
                }
            }
            if(!found) {
                currentState += "_";
            }
            found = false;
        }     
        return currentState;
    }

    public char[] getGuesses() {
        return guesses;
    }

    public int getRemainingGuesses() {
        int count = 0;
        for(char c : guesses) {
            if (c != '\0') {
                count++;
            }
        }
        return MAX_GUESSES - count;
    }

    public boolean tryChar(char guess) {
        boolean contains = false;
        for(char c : this.getGuesses()) {
            if(c == guess) {
                contains = true;
                break;
            }
        }
        if(contains) {
            return false;
        }
        else {
            if(this.getWord().indexOf(guess) != -1) {
                this.getGuesses()[MAX_GUESSES - this.getRemainingGuesses()] = guess;
                return true;
            }
            else {
                this.getGuesses()[MAX_GUESSES - this.getRemainingGuesses()] = guess;
                return false;
            }
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getWord() {
        return wordToGuess;
    }

    public void setWord(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }
}