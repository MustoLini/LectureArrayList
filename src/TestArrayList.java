import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayListOne; // A variable of ArrayList

        arrayListOne = new ArrayList(); // An Array List object

        ArrayList<Integer> arrayListTwo = new ArrayList<Integer>(); // Create an object of array list

        ArrayList<String> names = new ArrayList<String>(); // Specify the data type of your list

        names.add("Donald trump");
        names.add("George Bush");
        names.add("Magdalena Andersson");
        names.add("Joe Biden");
        names.add("Barack Obama");


        // It goes through names the normal way.
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println();


        // It goes through names backwards.
        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }





    }

}
