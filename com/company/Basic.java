/*constructor and method over loading*/
package com.company;

import java.util.Scanner;

class A{
     A(int a ,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);


    }
    A(int a ,int b,int c){
        System.out.println(a+b+c);
        System.out.println(a-b-c);
        System.out.println(a*b*c);
        System.out.println(a+b/c);
    }

}
public class Basic {

    static void main(int a, int b){
        System.out.print("make alive "+a+b);
    }
    static void main(int a, int b,int c){
        System.out.print("make alive "+a+b*c);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        A a=new A(i,j);
        new A(i,j,k);
        main(i,j);
        main(i,j,k);
    }
}
