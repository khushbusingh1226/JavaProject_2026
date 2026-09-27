package DailyProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoGreterThan10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 13, 4, 5, 16, 7, 18, 9, 10);
        List<Integer> result = list.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println(result);
    }
}
