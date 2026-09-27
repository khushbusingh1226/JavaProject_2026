package javaprogrms;

import java.util.HashMap;
import java.util.Map;

public class ReplaceDuplicates {

    public static void main(String[] args) {
        String str = "Automation".toLowerCase();
        char []ch = str.toCharArray();
        StringBuilder result = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);

        for (char c : ch) {

            if(map.get(c)>1){
                result.append(map.get(c));
            }
            else
            {
                result.append(c);
            }
        }

        System.out.println(result);

    }

}
