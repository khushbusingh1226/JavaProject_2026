package oopsconcept;

public class Methodoverloading {

    public static void main(String[] args){
        Methodoverloading obj = new Methodoverloading();
        obj.sum();
       System.out.println(obj.sum(80));
        System.out.println(obj.sum(20,40));
    }
    public  void sum(){

         System.out.println("no parameter");
        }

   public int sum(int a){
        System.out.println("with one parameter");
        return a;
    }

    public int sum(int a, int b){
        System.out.println("with 2 parameter");
         return a+b;
    }

}
