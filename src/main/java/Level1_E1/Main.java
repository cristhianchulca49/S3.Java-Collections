package Level1_E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Year year = new Year();
        year.printYear();

        year.setMonth(7, "August");
        year.printYear();

        HashSet<Month> yearHashSet = new HashSet<>(year.getYear());
        yearHashSet.add(new Month("January"));

        Iterator<Month> it = yearHashSet.iterator();
        while (it.hasNext()) {
            Month m = it.next();
            System.out.println(m.getName());
        }
    }
}

