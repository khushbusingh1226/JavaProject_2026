package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;

        for(int i=5; i>=1; i--){
            char ch ='A';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println("");
        }

    }

}
/*
ABCDE
ABCD
ABC
AB
A
 */