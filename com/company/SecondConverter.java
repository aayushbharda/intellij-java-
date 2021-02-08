package com.company;

import java.util.*;

class SecondConverter{
    public static void main(String[] args){
        Scanner A =new Scanner(System.in);
        System.out.print("enter days:");
        int d =A .nextInt();
        d=d*24*60*60;
        System.out.print("The amount of seconds in the given days is: "+d);
        System.out.println();

    }
}