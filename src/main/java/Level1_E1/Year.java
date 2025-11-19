package Level1_E1;

import java.util.ArrayList;
import java.util.List;

public class Year {
    private List<Month> year = new ArrayList<>();

    public Year() {
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
    }

    public List<Month> getYear() {
        return year;
    }

    public void setMonth(int i, String month) {
        year.add(i, new Month(month));
    }

    public void printYear() {
        for (Month m : year) {
            System.out.println(m.getName());
            System.out.println("-----------");
        }
    }

}
