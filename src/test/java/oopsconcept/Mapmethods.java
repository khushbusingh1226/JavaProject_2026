package oopsconcept;

import java.util.HashMap;
import java.util.Map;
//thread safety no for hashmap allow one null key multiple null value
// doen,t allow duplicate replace with latest value method os put to add , get to get data, contains
/*HashMap
✓ Fast - not synchronized
✓ Null key
✓ Null values - multiple
✗ Thread-safe */

public class Mapmethods {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("b",2);
        map.put(null,3);
        map.put(null,4);// not allow mutiple null key value it will replace
        map.put("e", null);
        map.put("f", null);
        System.out.println(map);
        System.out.println(map.get("a"));
    for(Map.Entry<String,Integer> entry :map.entrySet()){
        System.out.println("keys " + entry.getKey() + " value " + entry.getValue());


    }

    }
}
