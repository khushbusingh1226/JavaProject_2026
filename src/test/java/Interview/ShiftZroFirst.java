package Interview;

import java.util.Arrays;

class ShiftZerofirst {
    public static void main(String[] args) {

        int[] arr = {34, 0, 9, 5, 7, 4, 0, 4, 0, 23};

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Put zeros in the remaining positions
        while (index >=0) {
            arr[index] = 0;
            index--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
