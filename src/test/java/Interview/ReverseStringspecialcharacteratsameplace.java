package Interview;

public class ReverseStringspecialcharacteratsameplace {public static void main(String[] args) {

    String str = "hellow! @world %&testing";
    char[] arr = str.toCharArray();

    int start = 0;

    for (int i = 0; i <= arr.length; i++) {

        if (i == arr.length || arr[i] == ' ') {

            int left = start;
            int right = i - 1;

            while (left < right) {

                if (!Character.isLetterOrDigit(arr[left])) {
                    left++;
                }
                else if (!Character.isLetterOrDigit(arr[right])) {
                    right--;
                }
                else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }

            start = i + 1;
        }
    }

    System.out.println(new String(arr));
}
}
