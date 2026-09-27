package Interview;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10,30,50,80,60};
        int [] reverse = new int[5];
        for(int i=0; i<arr.length; i++)
        {
            reverse[i] = arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(reverse));


    }
}

/*public class Main {
        public static void main(String[] args){

            int[] arr = {10, 20, 30, 40, 50};

            int left =0;
            int right = arr.length-1;
            while(left<right){
              int temp = arr[left];
              arr[left]= arr[right];
              arr[right] = temp;
              left++;
              right--;
            }
            System.out.println(Arrays.toString(arr));





        } */