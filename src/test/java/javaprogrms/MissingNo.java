package javaprogrms;

public class MissingNo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        int actual = 0;
        int n = 9;
        int expected = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            actual = actual + arr[i];
        }
        int missing = expected - actual;
        System.out.println("Missing No: " + missing);
    }
}