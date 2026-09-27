package Interview;

public class FirstnonrepetetiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pprpgmring";

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++)

			{
				if (str.charAt(i) == str.charAt(j)) {

					count++;
				}

			}

			if (count == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
/* class Main {
    public static void main(String[] args) {
        String str = "pprogramming";
        char [] words = str.toCharArray();
        Map <Character,Integer> map = new LinkedHashMap<>();
        for(char strmap:words)
        {
            if(map.containsKey(strmap))
            {
                map.put(strmap, map.get(strmap)+1);
            }
            else
            {
                map.put(strmap, 1);
            }
        }
        System.out.println(map);


        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1){
            System.out.print(entry.getKey());
            break;
        }
        }

}
}*/