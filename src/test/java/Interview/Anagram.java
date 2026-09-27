package Interview;

import java.util.Arrays;

public class Anagram {

	public boolean angaram(String s1, String s2) {
       String str1= s1.replaceAll("\\S", "").toLowerCase();
		String str2= s2.replaceAll("\\S", "").toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Lengths do not match");
			return false;
		} else {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram obj = new Anagram();
		System.out.println(obj.angaram("Silent", "Listen"));
		System.out.println(obj.angaram("TOSS", "Shot"));
		System.out.println(obj.angaram("CAT", "ACT"));
		System.out.println(obj.angaram("Silent", "Lis  ten"));
	}

}
/*public static void main(String[] args) {
       String s1 ="listen";
       String s2= "silent";
       char [] ch = s1.toCharArray();
       char [] ch1 = s2.toCharArray();
         Arrays.sort(ch);
         Arrays.sort(ch1);
         if(Arrays.equals(ch, ch1))
      {
          System.out.println("anagram");
      }
      else
      {
          System.out.println("not anagram");
      }*/