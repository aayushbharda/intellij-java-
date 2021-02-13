package Project;

import java.util.Random;

public class CoinToss {

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

        for(int i=0;i<7;i++){
            System.out.println(game.tossACoin());
        }

    }
}
