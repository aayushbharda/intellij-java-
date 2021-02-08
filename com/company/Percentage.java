package com.company;

import java.util.Scanner;
import java.lang.System;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0, total = 0;

        System.out.print("enter number of subjects : ");
        int n = sc.nextInt();

        System.out.print("enter max marks of a subject : ");
        float i = sc.nextFloat();

        if (n >= 1 && i >= 1){
            sum=i*n;
            System.out.println("Sum of max marks of "+n+" subjects: "+sum);
        }
        else {
            System.out.println("value of number of subject or max marks of a subject can't be zero or negative.");
            System.exit(0);
        }



        for(int j=1;j<=n;j++){
            System.out.print("enter scored marks of subject " + j + ": ");

            float sub = sc.nextFloat();

            if(0<=sub&&sub<=i) total += sub;

            else {
                   System.out.println();
                System.out.println("Error! scored marks will not be greater than max marks.");
                 System.exit(0);

            }
        }
           float percent= total/sum*100;
        System.out.println("the percentage : "+percent+"%");
    }
}