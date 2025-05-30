package composition.exerciseTwo.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main( String[] args ) throws ParseException {
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow awesome!");
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
        Post p1 = new Post(dtFormat.parse("21/06/2025 13:05:44"), "Travelling", "Going to Portugal", 12);

        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);
    }
}
