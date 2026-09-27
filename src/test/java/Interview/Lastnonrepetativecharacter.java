package Interview;

public class Lastnonrepetativecharacter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "swimming";
        for(int i = str.length()-1; i>=0; i--){
            int count =0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                System.out.println("last Non repetative character : " + str.charAt(i));
                break;
            }
        }


    }
}
