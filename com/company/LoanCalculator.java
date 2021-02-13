package com.company;

import java.util.Scanner;

public class LoanCalculator {

public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            int n = scanner.nextInt();



            for (int month = 1; month <=n; month++) {
                amount -= (int) Math.ceil(0.1 * amount);
            }

            System.out.println(amount);




        }
    }