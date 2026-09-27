package javaprogrms;

public class Plindromenumber {
    public static void main(String[] args) {
        int num = 141;
        int original =num;
        int rev= 0;
        while(num>0){
            int digit = num%10;
            rev=rev*10+digit;
            num= num/10;

        }
        System.out.println(rev);
        if(original==rev){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("Not palindrome number");
        }
    }

}
