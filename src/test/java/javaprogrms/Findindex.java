package javaprogrms;

public class Findindex {
    public static void main(String args[]) {
        int[] arr = {5, 12, 7, 10, 8, 9};
        int target =17;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==target){
                   System.out.println("Found at index "+i+" "+j);
                   System.out.println("Found at num" + arr[i] + " " + arr[j]);
               }
            }
        }

    }
}
