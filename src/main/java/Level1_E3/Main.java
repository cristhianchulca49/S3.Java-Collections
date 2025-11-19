package Level1_E3;

public class Main {
    public static void main(String[] args) {
        do {
            Game game = new Game();
            game.initialGame(Input.readDocument("countries.txt"));
            game.endOfGame();
        } while (Input.readBoolean("Do you want start again? write: y (yes) o n (no)"));
    }
}