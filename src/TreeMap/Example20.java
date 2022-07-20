import java.util.*;
public class Example20 {
    public static void main(String args[]) {
        TreeMap < Integer, String > tree_map = new TreeMap <> ();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");
        System.out.println("Value before poll: " + tree_map);
        System.out.println("Value returned: " + tree_map.pollLastEntry());
        System.out.println("Value after poll: " + tree_map);
    }
}
