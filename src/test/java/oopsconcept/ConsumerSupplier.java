package oopsconcept;
//consumer take input but no return type its will have accept method to accept value
//A Supplier doesn't take any input but returns a value having get method
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplier {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> {
            System.out.println(name);
        };
        consumer.accept("khushbu");

        Consumer<Integer> consumernum = (age) -> {
            System.out.println(age);
        };
        consumernum.accept(10);

       Supplier <String> supplier = () -> {
        String str = "khushbu";
        String str2 = "Testing";
        return str+str2;
             };
        System.out.println(supplier.get());

        Supplier<Integer> num = ()->{
            return null;
        };
        System.out.println(num.get());


    }
}