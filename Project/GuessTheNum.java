package Project;


import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {

    int theNumber;
    int max;
    Scanner sc =new Scanner(System.in);
    public GuessTheNum(){
        Random rand=new Random();
        max=100;
        theNumber=Math.abs(rand.nextInt())%(max+1);

    }
    public void play() {
        while(true) {
            int move = sc.nextInt();
            if (move > theNumber) {
                System.out.println("your move is too big");
            } else if (move < theNumber) {
                System.out.println("you move is too small");
            } else {
                System.out.println("YOU GOT IT BRO!");
                break;
            }
        }
    }

    public static void howBigIsNum(int x) {
            if(x>=0&&x<=10){
                System.out.println("NUMBER IS SMALL.");
            }
            else if(x>=11&&x<=100){
                System.out.println("NUMBER IS BIG.");
            }
            else {
                System.out.println("OUT OF RANGE!");
            }
    }
    public static void main(String[] args) {
        howBigIsNum(30);

        GuessTheNum game=new GuessTheNum();
        System.out.println("Welcome to my game.Try and guess number."+
                "number is between 0 and"+game.max+"inclusive."
                      +"type a number and get started.");
           game.play();
    }
}
