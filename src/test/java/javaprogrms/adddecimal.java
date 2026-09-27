package javaprogrms;

public class adddecimal {
    public static void main(String[] args) {
        double [] arr = {1,1.5,3,4.5,8,9.7} ;
        double sum = 0;
        for(int i=0;i<arr.length; i++)
        {
            int wholenum = (int)arr[i];
            double decimal = arr[i]-wholenum;
            sum = sum+decimal;
        }
        System.out.println(sum);
        System.out.printf("%.1f", sum);
    }
}
