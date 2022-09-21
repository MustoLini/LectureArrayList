import java.util.ArrayList;

public class TestRemove extends ArrayList {
    public static void main(String[] args) {
        TestRemove myTest= new TestRemove();
        myTest.add(10);
        myTest.add(210);
        myTest.add(110);
        myTest.add(104);
        for (Object value: myTest) {
            System.out.println(value);
        }
        myTest.removeRange(0,2);
        for (int i = 0; i < myTest.size(); i++) {
            System.out.println(myTest.get(i));
        }
    }
}
