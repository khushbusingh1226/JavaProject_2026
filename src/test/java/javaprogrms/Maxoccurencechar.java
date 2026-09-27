package javaprogrms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maxoccurencechar {
    public static void main(String[] args) {
        String str = "automation testing";
        Map<Character , Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        System.out.println(map);

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}
