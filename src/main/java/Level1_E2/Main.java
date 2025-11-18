package Level1_E2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersList1 = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            numbersList1.add(i);
        }

        List<Integer> numbersList2 = new ArrayList<>();

        ListIterator<Integer> it = numbersList1.listIterator(numbersList1.size());
        while (it.hasPrevious()) {
            numbersList2.add(it.previous());
        }

        System.out.println("List 1");
        System.out.println(numbersList1);
        System.out.println("List 2");
        System.out.println(numbersList2);
    }
}
