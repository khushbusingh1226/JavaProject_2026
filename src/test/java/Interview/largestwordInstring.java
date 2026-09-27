package Interview;

public class largestwordInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java is programming language";
		String[] word = str.split(" ");
		String largestword = " ";

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > largestword.length()) {
				largestword = word[i];
			}

		}
		System.out.println("largest word :" + largestword);
		System.out.println("largest word :" + largestword.length());
	}

}
