package javaprogrms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatenumber {
    public static void  main(String[] args) {
        int[] arr = {3, 5, 6, 6, 4, 3, 8, 5};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for (int num : set) {
            System.out.println("New Array:" + num + " ");

        }
    }
}

