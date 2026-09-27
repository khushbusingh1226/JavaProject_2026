package Interview;

public class counteachwordlengthfindmax {
    public static void main(String[] args) {
        String str = "I am the best automation Engineer";
        String [] words = str.split(" ");
        String longest = " ";
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+ ":" +words[i].length());
            if(words[i].length()>longest.length()){
                longest =  words[i];
            }

        }
        System.out.println("Largest string; " +longest);
        System.out.println("length :" + longest.length());

    }
}
