package com.company;


import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String q = sc.nextLine();
        String w = sc.nextLine();

        System.out.println(s.toLowerCase());
        System.out.println(s.replace(" ","_"));

        String le="Dear <|name|>,Thanks a lot";
        System.out.println(le.replace("<|name|>",w));

        //detect double or triple space

        System.out.println(s.indexOf("  "));


    }
}
