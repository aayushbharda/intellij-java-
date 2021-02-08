package com.company;

import java.util.*;
import java.io.*;

class Series1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number Of Queries: ");
        int q=in.nextInt();
        if(q>=0&&q<=500){
            for(int i=0;i<q;i++){
                System.out.print("Enter a number for a, b & n(with space in between): ");
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if((a>=0&&a<=50)&&(b>=0&&b<=50)){
                    if(n>=1&&n<=15){
                        System.out.print("The series for your given Data is: ");
                        for(int j=0;j<n;j++){

                            a+=(int) Math.pow(2,j)*b;


                            System.out.print(a+" ");
                        }
                        System.out.println();
                    }
                    else System.out.println("n out of range");
                }
                else
                    System.out.println("a or b out of range.");
            }
            in.close();
        }
        else System.out.println("out of query range.");
    }
}
