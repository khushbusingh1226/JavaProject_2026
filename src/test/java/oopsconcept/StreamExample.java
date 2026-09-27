package oopsconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,9,4,0,6,6);
       /* for(Integer i : list){
            System.out.println(i);
        } */
     //Double value
        list.stream()
                .filter(i-> i%2==1)
                .sorted()
                .map(i->i*2)
                .forEach(i->System.out.println(i));

    //
        list.stream().distinct().forEach(System.out::println);

        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first);



        //Stream<Integer> streamdata = list.stream();
        //Stream<Integer> mappeddata =  streamdata.map(i->i*2);
        //mappeddata.forEach(i->System.out.println(i));

      /*  long countnum = streamdata.count();
        System.out.println("Count length: " + countnum);
        list.forEach(i->System.out.println(i));
        System.out.println(streamdata);*/

      /* Stream<Integer>sorteddata =streamdata.sorted();
       sorteddata.forEach(i->System.out.println(i));*/






    }
}
