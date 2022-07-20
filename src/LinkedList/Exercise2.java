package LinkedList;

import java.util.LinkedList;
public class Exercise2 {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        // Print the linked list
        for (String element : l_list) {
            System.out.println(element);
        }
    }
}
