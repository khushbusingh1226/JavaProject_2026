package oopsconcept;
/* Inheritance in java where child/subclass inherit properties of parent class by using extend keyword
we can create object of parent class then we use parent method only we cannot use child method because parent is not inheriting  child class properties
when we create object of child class then we can access both class method
We can create object of parent class referring child class, but we can create object of child class referring parent class due to upcasting upper to lower but no lower to upper
While execution overridden method execute first
*/
public class InheritanceCar {

    public void car (){
        System.out.println("car parent class");
    }
    public void car2(){
        System.out.println("car2 parent class");
    }
    public void drive(){
        System.out.println("drive parent class");
    }

}
  class BMW extends InheritanceCar{
    @Override
    public void car(){
        System.out.println("car child class");
    }

    public void drive(){
        System.out.println("drive class child class");
    }


      public void eject() {
          System.out.println("eject child class");
      }
  }
class Main{
    public static void main(String[] args) {
        // when we create parent class object then it only access parent method not child method
        InheritanceCar parentclassobj = new InheritanceCar();
        parentclassobj.car();
        parentclassobj.car2();
        // parentclassobj.drive();
        // parentclassobj.eject( );

        BMW bmwobj = new BMW();
        bmwobj.drive();
        bmwobj.eject();
        bmwobj.car();
        bmwobj.car2();

        InheritanceCar childclassobj = new BMW();
        childclassobj.drive();
        childclassobj.car2();

        /*InheritanceCar childclassobj2 = new InheritanceCar();
        childclassobj2.car();
        childclassobj2.drive();*/

    }
}
