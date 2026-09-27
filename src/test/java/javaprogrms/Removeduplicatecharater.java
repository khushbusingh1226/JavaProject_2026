package javaprogrms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatecharater {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> set = new LinkedHashSet<>();

        for(int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);


        for(char c : set) {
            System.out.print(c);
        }

    }

}
