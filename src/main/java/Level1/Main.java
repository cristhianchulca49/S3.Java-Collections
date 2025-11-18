package Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main() {
        List<Month> year = new ArrayList<>();

        year.add(new Month("January"));
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));
        for (Month m : year) {
            System.out.println(m.getName());
        }
        System.out.println("-----------");
    }
}

