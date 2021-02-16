package com.company;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of string you have to enter");
        int T = sc.nextInt();

        if (T >= 0 && T <= 10) {
            for (int i = 1; i <= T; i++) {
                System.out.println("enter string name");
                String s = sc.next();


                for (int j = 0; j < s.length(); j++) {
                    if (j % 2 == 0) {
                        System.out.print(s.charAt(j));
                    }
                }
                System.out.print(" ");
                    System.out.print(" ");
                    for (int k = 0; k < s.length(); k++) {
                        if (k % 2 == 1) {
                            System.out.print(s.charAt(k));
                        }
                }
                System.out.println();
            }
        }

        else{
                    System.out.println("out of range!");
                }



    }
}