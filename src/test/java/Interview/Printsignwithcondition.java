package Interview;

public class Printsignwithcondition {
    public static void main(String[] args) {
        int num = 799233184;

        String str = String.valueOf(num);
        for(int i =0; i<str.length()-1; i++){
            int current = str.charAt(i);
            int next = str.charAt(i+1);
            if(current<next){
                System.out.print("<");
            }
            else if(current>next){
                System.out.print(">");
            }
            else{
                System.out.print("=");
            }
        }

    }
}
