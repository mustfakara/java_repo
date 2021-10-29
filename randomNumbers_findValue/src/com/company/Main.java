package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj= new Scanner(System.in);

        int [][] numbers= new int[5][5];
        for (int i=0;i<numbers.length;i++)
            for (int j=0;j<numbers.length;j++)
            {
                numbers[i][j]=(int)(Math.random()*100);
            }

        for (int i=0;i<numbers.length;i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int minValue = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j]<minValue)
                    minValue= numbers[i][j];
            }
        }
        System.out.println();
        System.out.println("Min Value is "+minValue);
    }


}
