package Interview;

public class Replacespecialcharacter {
    public static void main(String[] args) {
        String str ="Roshan@123#Automation$Tester!";
        String result = " ";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
                result = result+ch;
            }

        }
        System.out.println(result);
        String str1 = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(str1);

    }
}
