package javaprogrms;

import java.util.Arrays;
import java.util.List;

public class Fimmmissingbothlistelement {
    public static void main(String[] args) {
        List<Character> list1 = Arrays.asList('A', 'B', 'D','E','H');
        List<Character>list2 = Arrays.asList('A', 'F', 'D','E','G');
        for(char c: list1)
        {
            if(!list2.contains(c)){
                System.out.println("list2 missing element:" + c);
            }
        }
        for(char c: list2)
        {
            if(!list1.contains(c)){
                System.out.println("list1 missing element:" + c);
            }
        }
    }
}
