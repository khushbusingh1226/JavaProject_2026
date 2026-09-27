package oopsconcept;
/* Abstraction is the process of hiding implementation details and showing only essential features to the user.
* from abstraction we cannot achieve 100 % abstraction *
* An abstract class is declared using the abstract keyword  and method should be abstract and concrete
* abstract body implements in subclass
* object cannot be created for abstract class
* Abstract class  have constructor*
*  can be without abstract method */
public abstract class AbstractConceptShape {
     void filling () {
       System.out.println(" fill the shape");
      }
      abstract void drawing();
    AbstractConceptShape(){
        System.out.println(" created");
    }
    }

    class Test extends AbstractConceptShape {


        public static void main(String[] args) {
            AbstractConceptShape obj = new Test(); {
              obj.drawing();
              obj.filling();
            }
        }

        @Override
        void drawing() {
            System.out.println("drawing the shape");

        }
    }


