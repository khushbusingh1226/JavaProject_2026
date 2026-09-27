package Interview;

public class ReversewordsInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = " java is easy to test";
String [] words = str.split(" ");
   
for(int i=0; i<words.length; i++) {
	
	String word = words[i];
	for(int j=word.length()-1; j>=0; j--)
	{
		
	System.out.print(word.charAt(j));	
	}
	
	System.out.print(" ");
}


	}
	

}
