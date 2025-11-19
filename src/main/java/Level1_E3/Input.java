package Level1_E3;

import Level1_E3.Exceptions.CustomStringException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static HashMap<String, String> readDocument(String pathname) {
        HashMap<String, String> mapCountries = new HashMap<>();
        try {
            Scanner scDocument = new Scanner(new File(pathname));
            while (scDocument.hasNext()) {
                String country = scDocument.next().replace("_", " ");
                String capital = scDocument.next().replace("_", " ").replace("-", " ");
                mapCountries.put(country, capital);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return mapCountries;
    }

    public static String readString(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    public static boolean readBoolean(String message) {
        while (true) {
            try {
                System.out.println(message);
                String letter = sc.nextLine();
                if (letter.length() > 1) {
                    throw new CustomStringException("Input must be a single letter: Y or N");
                }
                return switch (letter.toLowerCase()) {
                    case "n" -> false;
                    case "y" -> true;
                    default -> throw new CustomStringException("You just have to write Y or N");
                };
            } catch (CustomStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
