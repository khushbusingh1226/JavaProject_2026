package Interview;

import java.util.HashMap;
import java.util.Map;

class  Countoccurencechaarcter {
	public static void getcharcount(String name) {
		char[] StrArray = name.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char c : StrArray) {

			if (charmap.containsKey(c)) {

				charmap.put(c, charmap.get(c) + 1);

			} else {

				charmap.put(c, 1);
			}
		}
		System.out.println("name" + ":" + charmap);
	}

		public static void main (String[]args){
			// TODO Auto-generated method stub
			getcharcount("Khushbu");
			getcharcount("K");
			getcharcount("te");

		}

	}

