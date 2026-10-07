package Interview;

import java.util.HashMap;
import java.util.Map;

public class Reversefindmax {
    public static void main(String [] args){
        String str = "hellow world";
        String result = " ";
        for(int i =str.length()-1; i>=0; i--){
            result = result+str.charAt(i);
        }
        System.out.println("Reversed string:" + result);
        Map<Character , Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        char maxchar = 0;
        int maxcount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxcount){
                maxcount = entry.getValue();
                maxchar = entry.getKey();
            }


        }
        System.out.print("max character " + maxchar + " count:" + maxcount);


    }
}
