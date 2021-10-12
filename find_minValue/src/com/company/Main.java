package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=0;
        int situation;
        Scanner myObj= new Scanner(System.in);
        System.out.println("How many numbers do you want to write?? ");
        System.out.println("(Zero is not an optional...)");

        int [] numbers= new int[myObj.nextInt()];

        while(true)
        {
            if(count==numbers.length)
                break;
            System.out.println("Enter "+(count+1)+".Number or Press '0' to quit");
            situation= myObj.nextInt();

            if (situation==0 || count==numbers.length)
                break;
            else
                numbers[count]=situation;
            count++;
        }
        int minValue= numbers[0];
        for (int i = 0 ; i<numbers.length;i++)
        {
            if(numbers[i]==0)
                break;
            if(numbers[i]<minValue)
                minValue=numbers[i];
        }
        System.out.println("Your minimum Value is == "+ minValue);
    }
}
