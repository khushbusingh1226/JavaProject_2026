package javaprogrms;

public class Compressstring {
    public static void main(String[] args) {
        String str =  "aaabbbccccdd";
       StringBuilder result = new StringBuilder();
        int count =1;
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else{
                result.append(str.charAt(i)).append(count);
                count = 1;

            }
        }
        // Last character if will not add it will skip last character
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println("Compressed String  " +  result);

    }
}
