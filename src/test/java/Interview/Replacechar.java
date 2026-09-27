package Interview;

public class Replacechar {
    public static void main(String[] args) {
        String str = "tommorow";
        String result =  " ";
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)=='o'){
                result = result+'$';
            }
            else{
                result = result+ str.charAt(i);
            }

        }
        System.out.println(result);
    }
}
