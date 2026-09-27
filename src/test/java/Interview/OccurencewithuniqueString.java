package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurencewithuniqueString {
    public static void main(String[] args) {
        String str ="This is an easy program. This is an automation testing. This is not a manual testing.";
        String [] strarry = str.split(" ");
        Map<String , Integer> map = new LinkedHashMap<>();
        for(String word : strarry)
        {
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word,1);
            }

        }
       // System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        for(String word: map.keySet())
        {
            System.out.print( word + " ");
        }
    }
}
