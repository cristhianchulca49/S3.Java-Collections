package Level1_E3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Output {

    public static void saveScore(String name, int score) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("scores.txt", true));
            writer.println(name + ": " + score);
            System.out.println("Scores saved!");
        } catch (IOException e) {
            System.out.println("Error saving score!");
        }
    }
}
