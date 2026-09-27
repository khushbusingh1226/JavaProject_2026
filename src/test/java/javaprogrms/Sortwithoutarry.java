package javaprogrms;

public class Sortwithoutarry {
    public static void main(String[] args) {
        int num = 143724035;
        for(int i=0;i<num;i++)
        {
            int temp = num;
            while(temp>0){
                int digit = temp%10;
                if(digit==i)
                {
                    System.out.print(digit);
                }

                temp= temp/10;

            }
        }

    }
}
