package javaprogrms;

public class Occurenceofdigit {
    public static void main(String[] args) {
        int num = 16626678;
        int originalno= num;
        int count =0;
        while(num>0){
            int digit = num % 10;
            if(digit==6)
            {
                count++;
            }
            num = num/10;

        }

        int appendedNumber = (originalno * 100) + 25;
        System.out.println("occurence of digit 6:" + count);
        System.out.println("appended No:" + appendedNumber);

    }
}
