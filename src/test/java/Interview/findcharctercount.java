package Interview;

import java.util.HashMap;
import java.util.Map;

public class findcharctercount {
    public static void main(String[] args) {
        String str = "27sept2026";
        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : arr){
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else map.put(ch,1);
        }
        System.out.println("2 occurred: " + map.get('2'));
    }

}
/* String str = "27sept2026";
        char ch = '2';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            }
             }
        System.out.println("character " + ch + " of count " +count);
    }*/