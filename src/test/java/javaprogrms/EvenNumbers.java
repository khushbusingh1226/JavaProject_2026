package javaprogrms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EvenNumbers {

    public static void main(String[] args){

        String str ="Listen";
        char [] ch = str.toCharArray();
        for(int i =0; i<ch.length-1; i++)
        {
            for(int j =0; j<ch.length-i-1; j++)
            {
                if(ch[j] > ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }

        }
        System.out.println(ch);
    }
}
