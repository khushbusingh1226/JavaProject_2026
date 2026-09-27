package javaprogrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listmissingelemt {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList(Arrays.asList("login", "checkout", "Search","Logout"));
        List<String> list2 = new ArrayList (Arrays.asList("login", "checkout"));
        list1.removeAll(list2);//remove
        System.out.println(list1);
        for(String item:list1 ){
            if(!list2.contains(item))
            {
                System.out.println(item);//for each loop
            }

        }

    }
}

