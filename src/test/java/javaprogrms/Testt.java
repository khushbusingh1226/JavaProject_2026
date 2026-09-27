package javaprogrms;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Testt {
    public static void main(String[] args) {
       String str = "Khushbu" ;
        char maxChar = ' ';
        char minChar = ' ';
       char[] charArray = str.toCharArray();
       Map<Character, Integer> map = new LinkedHashMap<>();
       for(char c : charArray){
           if(map.containsKey(c))
               map.put(c, map.get(c)+1);

           else
               map.put(c,1);

       }
       System.out.println(map);
       int max =Integer.MIN_VALUE;
       int min =Integer.MAX_VALUE;


       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue()>max) {
               max = entry.getValue();
                maxChar  = entry.getKey();

           }
               if (entry.getValue()<min){
               min=entry.getValue();
               minChar  = entry.getKey();
               }
           }
        System.out.println( minChar + " " +min );
        System.out.println(maxChar + " " +max);
       }
    }

