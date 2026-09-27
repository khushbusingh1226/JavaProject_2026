package Interview;

public class Findnumdigitspecialchar {
    public static void main(String[] args) {
    String str = "abcde123254@#$";
    int num = 0;
    int charcount =0;
    int specialchar=0;
        for(int i=0; i<str.length(); i++)
    {
        char ch = str.charAt(i);
        if(Character.isLetter(ch)){
            charcount++;
        }
        else if(Character.isDigit(ch)){
            num++;
        }
        else
        {
            specialchar++;
        }

    }

      System.out.println("Caharcter count" + charcount );
      System.out.println("Number count" +  num );
      System.out.println("special character" + specialchar );


}
}
