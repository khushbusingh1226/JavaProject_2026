package Interview;
//count occurrence of an in word automation
public class Countcharoccurence {
    public static void main(String[] args) {
        String str = "automation" ;
        char ch ='a';
        int count =0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==ch)
                count++;

        }
        System.out.println(ch +":" +count);
    }
}
