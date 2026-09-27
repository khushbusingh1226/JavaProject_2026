package javaprogrms;

public class SumTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5};
        int [] arr2 = {6,8,9};
        int [] result = new int [3];
        for(int i=0; i<arr1.length; i++){
            result[i]=arr1[i]+arr2[i];
            System.out.println(result[i]);
        }
    }
}
