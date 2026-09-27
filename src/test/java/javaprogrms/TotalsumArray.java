package javaprogrms;

public class TotalsumArray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5};
        int [] arr2 = {6,8,9};
        int sum =0;
        for (int j : arr1) {
            sum = sum + j;
        }
        for (int j : arr2) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
