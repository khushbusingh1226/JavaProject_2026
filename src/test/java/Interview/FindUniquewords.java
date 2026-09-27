package Interview;

class FindUniqueness {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "roshan is automation tester & roshan is ui tester";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(words[i] + " ");
            }
        }
    }}
