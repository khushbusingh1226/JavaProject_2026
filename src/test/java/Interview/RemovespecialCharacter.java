package Interview;

public class RemovespecialCharacter {
    public static void main(String[] args) {
        String str = "Ja@va#123! Pro*gram$";
        String result = " " ;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z' ||str.charAt(i)>='a'&& str.charAt(i)<='z'){
                result = result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
