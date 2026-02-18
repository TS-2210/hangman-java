public class Hangman {
    private String playerName;
    private String wordToGuess;
    public Hangman(String playerName) {
        this.playerName = playerName;
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