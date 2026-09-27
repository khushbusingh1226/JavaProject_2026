package oopsconcept;

import java.util.ArrayList;
import java.util.List;
// List supports index-based operations such as get() and set()to add - add method, to retrieve - get method , remove - remove method, set value set method list allow duplicate value with insertion order and contains method for specific element
public class Listmethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(" ");
        list.add("");
        list.add(1,"h1");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.set(4, "Khushbu"));
       System.out.println(list.contains("k"));
      System.out.println(list.indexOf("b"));
        System.out.println(list);





    }
}
