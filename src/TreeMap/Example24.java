import java.util.*;
public class Example24 {
    public static void main(String args[]) {
        TreeMap < Integer, String > tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));
    }
}
