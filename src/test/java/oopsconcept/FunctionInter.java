package oopsconcept;
@FunctionalInterface
public interface FunctionInter {
    void function();


    }

    class MainTestInf {
        public static void main(String[] args) {
            FunctionInter refObj = ()->{
                System.out.println(1);
            };
                refObj.function();
        }
    }


