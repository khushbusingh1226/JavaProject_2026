package javaprogrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mergesortlist {
    public  static void  main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(5);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(7);
        list2.add(6);
        System.out.println(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list2);
        list3.addAll(list1);
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);

        List<String> names = Arrays.asList("John", "Alice", "Bob");
        Collections.sort(names);
        System.out.println(names);

    }
}
