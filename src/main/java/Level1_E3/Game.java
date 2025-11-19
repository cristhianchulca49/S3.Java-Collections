package Level1_E3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Game {
    private String name;
    private int score = 0;

    public Game() {
        this.name = Input.readString("Please, Enter your name: ");
    }

    public void initialGame(HashMap<String, String> countries) {
        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * countries.size());
            String country = countriesList.get(random);
            String answer = Input.readString("Guess the capital of : " + country);
            if (answer.equalsIgnoreCase(countries.get(country))) {
                System.out.println("correct!!");
                score++;
            } else {
                System.out.println("incorrect!! is: " + countries.get(country));
            }
        }
    }

    public void endOfGame() {
        System.out.println("Game over!!!");
        System.out.printf(name + " your score is: %d\n", score);
        Output.saveScore(name, score);
    }
}
