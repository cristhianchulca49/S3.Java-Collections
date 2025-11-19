package Level1_E3;

public class Game {
    private String name;
    private int score = 0;

    public Game(){
        this.name = Input.readString("Please, Enter your name: ");
    }
}
