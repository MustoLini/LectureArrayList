import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

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
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        names.set(2, "Steve Jobs"); // Sets the index of 2(that is Magdalena) to Steve jobs.
        names.remove(2); // Removes Steve Jobs from the arraylist and moves all others index forward one index.


        // It goes through names backwards.
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        names.subList(0, 2).clear();

        if (names.contains("Joe Biden")){
            System.out.println("Joe is here!");
        }

        System.out.println();
        Iterator individualItem = names.iterator();
        while (individualItem.hasNext()) {
            System.out.println(individualItem.next());
        }

        ArrayList nameCopy= new ArrayList();
        ArrayList nameBackUp = new ArrayList();

        nameCopy.addAll(names);

        // Create a generic array object
        Object[]moreName= new Object[4];
        moreName= nameCopy.toArray();
        System.out.println(Arrays.toString(moreName));

        // Checking if it exists.
         if (nameCopy.containsAll(names)){
             System.out.println("They exist.");

         }

    }

}
