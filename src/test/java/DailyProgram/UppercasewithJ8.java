package DailyProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercasewithJ8 {
    public static void main(String[] args) {

        List<String> car = Arrays.asList("bmw", "audi", "toyota");
        List<String> result = car.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());

        System.out.println(result);

    }
}
