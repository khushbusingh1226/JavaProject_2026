package javaprogrms;

import java.util.HashMap;
import java.util.Map;

public class MegeMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("b", 5);

        Map<String, Integer> map = new HashMap<>(map1);


        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }

        System.out.println(map);
    }
}
