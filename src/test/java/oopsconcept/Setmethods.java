package oopsconcept;

import java.util.HashSet;
import java.util.Set;

//Set focuses on storing unique elements and does not provide index-based access.
public class Setmethods {
    public static void main(String[] args) {
        Set<String> obj = new HashSet<>();
        obj.add("a");
        obj.add("b");
        obj.add("b");
        obj.add("c");
        obj.add("d");

        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.remove("d"));
        System.out.println(obj);
        System.out.println(obj.contains("a"));
        obj.clear();
        System.out.println(obj);


    }
}