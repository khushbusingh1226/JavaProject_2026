package oopsconcept;

import java.util.function.Predicate;
// predicate is predefined functional inteface in java 8 that take one argument and return boolean values
// having functional test method and used for conditional testing
public class Predicatexample {
    public static void main(String[] args) {
        Predicate<Integer> predicobj = (num )->num%2==0;
        /*Predicate<Integer> predicobj = (num )->{
            if(num%2==0){
                return true;
            }
            return false;
        };*/
        System.out.println(predicobj.test(5));
        System.out.println(predicobj.test(2));

        Predicate<String> predstr = (str)->{
            if(str.isEmpty()){
                return true;

            }
            return false;

        };
        System.out.println(predstr.test("hello"));
        System.out.println(predstr.test(""));

    }
}
