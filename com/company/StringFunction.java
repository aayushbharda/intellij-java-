package com.company;


import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);

        System.out.println(s.length());

        System.out.println(s.toLowerCase());

        System.out.println(s.toUpperCase());
        String e ="     canopy       ";
        System.out.println(e.trim());


        System.out.println(s.substring(7 ));
        System.out.println(s.substring(6,10));

        String d =sc.nextLine();
        String f = sc.nextLine();
        String g = sc.nextLine();
        System.out.println(s.replace(d,f));

        System.out.println(s.startsWith(g));
        System.out.println(s.endsWith(g));

        System.out.println(s.charAt(6));
        System.out.println(s.indexOf(4));
        System.out.println(s.indexOf('y'));
        System.out.println(s.lastIndexOf("awadadash",3));




    }
}
