package oopsconcept;
/*Encapsulation is the process of binding data (variables) and methods (functions) together into a single unit (class) and restricting
 direct access to the data by making fields private and providing controlled access through getter and setter methods.*/
public class Encapsulation {

        private int ssn;
        private String employeeId;
        private  int age;

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setSsn(78675734);
        obj.setEmployeeId("Kyushu");
        obj.setAge(30);
        System.out.println(obj.getAge());
        System.out.println(obj.getEmployeeId());
        System.out.println(obj.getSsn());

    }
    public int getSsn(){
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
