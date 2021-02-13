package Project;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    Scanner sc =new Scanner(System.in);

    public String tossACoin(){
        Random ran=new Random();
        int toss=Math.abs(ran.nextInt())%2;
            if (toss==0){
                return "HEADS";
            }
            else return "TAILS";
    }

    public static void main(String [] args){
        CoinToss game=new CoinToss();

        System.out.println("How Many Time You Want to Flip the Coin :");
        int a = game.sc.nextInt();
       if(a>0) {
           for (int i = 0; i < a; i++) {
               System.out.println(game.tossACoin());
           }
       }
       else System.out.println("Wrong Input!");
    }
}
