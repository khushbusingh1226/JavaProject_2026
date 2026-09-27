package Interview;

public class Findwordcount {
    public static void main(String[] args) {
        String str ="India is my country. My country is India.";
        str = str.replace(".", "");
        String [] words = str.split(" ");
        String word = "India";
        int count =0;
        for(int i=0; i<words.length; i++)
        {
            if(words[i].equals(word))
            {
                count++;
            }

        }
        System.out.println(word + " " + count);

    }
}
