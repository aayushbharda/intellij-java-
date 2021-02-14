package Project;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int c;
    int max;
    Scanner sc=new Scanner(System.in);

    public Game(){
        Random r =new Random();
        max=2;
        c=Math.abs(r.nextInt())%(max+1);
    }


     public void play() {

         for (int i = 0; i < 5; i++) {
             int u = sc.nextInt();

             if (u >= 0 && u < 3) {

                 if (u == 0 && c == 2 || u == 1 && c == 0 || u == 2 && c == 1) {
                     System.out.println("You Win!");
                 } else if (u == 0 && c == 1 || u == 1 && c == 2 || u == 2 && c == 0) {
                     System.out.println("You Lose!");
                 } else {
                     System.out.println("Tie!");
                 }
             } else {
                 System.out.println("Wrong Input!enter number 0,1 or 2");
                  break;
             }
         }
     }

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper & Scissors Game!!");
        System.out.println("Enter 0 for Rock,1 for Paper or 2 for Scissors");
        Game game=new Game();
        game.play();




    }
}
