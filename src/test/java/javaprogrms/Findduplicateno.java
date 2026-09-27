package javaprogrms;

public class Findduplicateno {
    public static void main(String[] args) {
        int [] arr = {3,5,6,6,4,3,8,5};
        for(int i=0; i<arr.length; i++)
        {
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]==arr[j])

                    System.out.println("duplicate numbers:" +arr[i]);
            }
        }

    }
}
