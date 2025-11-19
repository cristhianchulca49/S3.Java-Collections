package Level1_E3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Input {
    private static Scanner sc;

    public static HashMap<String, String> readDocument(String pathname) {
        HashMap<String, String> mapCountries = new HashMap<>();
        try {
            sc = new Scanner(new File(pathname));
            while (sc.hasNext()) {
                String country = sc.next();
                String capital = sc.next();
                mapCountries.put(country, capital);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return mapCountries;
    }

    public static String readString(String message) {
        sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
}
