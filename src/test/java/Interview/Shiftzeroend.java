package Interview;

import java.util.Arrays;

public class Shiftzeroend {
    public static void main(String[] args) {
        int arr[] = {3, 0, 7, 6, 0, 7, 0, 9};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
