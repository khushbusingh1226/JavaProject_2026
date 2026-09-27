package javaprogrms;

public class SumsubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int summax = arr[0];
        int currentmax =arr[0];
        int start =0;
        int end=0;
        int tempstart =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>currentmax+arr[i]){
                currentmax = arr[i];
                tempstart =i;
            }
            else{
                currentmax = currentmax+arr[i];
            }

            if(currentmax>summax)
            {
                summax =  currentmax;
                start =tempstart;
                end =i;
            }
        }
        System.out.println("Max" +" " + summax);
        System.out.print("Subarray: ");
        for(int i=start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
