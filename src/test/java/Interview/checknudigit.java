package Interview;

public class checknudigit {
    public static void main(String[] args) {
        String str = "fshs12221f$%327*8";

        for(int i =0; i<str.length(); i++)
        {
            char  ch = str.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print("character:" +ch);
            }
            else if (Character.isDigit(ch)){
                System.out.print("Number:" +ch);
            }
            else{System.out.println("special character: " + ch);

            }
            System.out.println(" ");
        }
    }

}
