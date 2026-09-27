package oopsconcept;

import java.util.function.Function;

//A Function accepts one value and transforms it into another value
//Having accept method
public class FunctionInterTest {
    public static void main(String[] args) {
        Function<String, Integer>  functionobj = (str )->{
            return str.length();
        };
       System.out.println(functionobj.apply("Khushbu"));
        System.out.println(functionobj.apply("Hello"));

  Function<Integer, Integer> numsquare = (n)->n*n;
  System.out.println(numsquare.apply(4));
  System.out.println(numsquare.apply(9));
    }
}
