package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeduplicatefromlist {
    public static void main(String[] args) {
      List<Integer> names = Arrays.asList(1,2,3,1,2,6,7,8,9);
      List<Integer> result = new ArrayList<>();
      for(int num : names){
          if(!result.contains(num)){
              result.add(num);
              System.out.println(num);
          }
      }

    }
}
