package javaprogrms;

import java.util.HashMap;
import java.util.Map;

class FindUniqueduplicatecharacter {

    public static void main(String[] args) {
        String str ="khushbu";
        char [] arr = str.toCharArray();
        Map <Character, Integer> map = new HashMap<>();
        for(char ch :arr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        System.out.println("Duplicate character");

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        System.out.println("Unique character");
        for(Map.Entry<Character, Integer> entry : map.entrySet())
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey() + " " + entry.getValue() );
            }

    }
}
