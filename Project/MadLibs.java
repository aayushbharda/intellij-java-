package Project;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner sc =new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String  adverb;
    String  randomNum;
     Random rand=new Random();

//     getters!
    public String getStory(){
            return story;
    }
    public String getName(){
           return name;
    }

    public String getAdjective1(){
        return adjective1;
    }

    public String getAdjective2(){
        return adjective2;
    }

    public String getNoun1(){
        return noun1;

    }

    public String getNoun2(){
        return noun2;

    }

    public String getNoun3(){
        return noun3;

    }

    public String getAdverb(){
        return adverb;

    }
    public String getRandomNum(){
        return randomNum;

    }

//    Setter

    public void setStory(String newStory){
       this.story=newStory;
    }

    public void setName(String newName){
        this.name=newName;
    }
    public void setAdjective1(String newAdjective1){
        this.adjective1=newAdjective1;
    }

    public void setAdjective2(String newAdjective2){
        this.adjective2=newAdjective2;
    }

    public void setNoun1(String  newNoun1){
        this.noun1=newNoun1;

    }

    public void setNoun2(String newNoun2){
        this.noun2=newNoun2;

    }

    public void setNoun3(String newNoun3){
        this.noun3=newNoun3;

    }

    public void setAdverb(String newAdverb){
        this.adverb=newAdverb;

    }
    public void setRandomNum(){
            int num=Math.abs(rand.nextInt())%100;
            int index=0;
            int [] numberHolder=new int[3];
            while(index<numberHolder.length){
                numberHolder[index]=num+index;
                index++;
            }
          randomNum="not"+numberHolder[0]+", not"+numberHolder[1]+", but"+numberHolder[2];
    }
    //print instructions.

    public void printInstruction(){
        System.out.println("Welcome to the MadLib game.if" +
                "you type in words,we'll give you a story,start" +
                "by typing in a name.");
    }

    //Get data from player.
    public void enterName(){

        setName(sc.nextLine());

    }
    public void enterNoun1(){
        System.out.println("give me a noun");
        setNoun1(sc.nextLine());
    }
    public void enterNoun2(){
System.out.println("give me a another noun");
        setNoun2(sc.nextLine());
    }
     public void enterNoun3(){
         System.out.println("give me a last noun!");
        setNoun3(sc.nextLine());
    }
    public void enterAdjective1(){
        System.out.println("I need a adjective.");
        setAdjective1(sc.nextLine());
    }
     public void enterAdjective2(){
         System.out.println("give me another adjective.");
        setAdjective2(sc.nextLine());
    }
    public void enterAdverb(){
        System.out.println("now, type a adverb.");
        setAdverb(sc.nextLine());
    }

    public void putTogetherTheStory(){
      String story;
      int num=Math.abs(rand.nextInt())%2;
      if (num==0) {
          story = "jesse and her best friend " + getName() + "went to disney world today!" +
                  "they saw" + getNoun1() + "in a show at magic kingdom and ate a " +
                  getAdjective1() + "feast for dinner .The next day she ran " + getAdverb() +
                  "to meet Mickey Mouse in his" + getNoun2() + " and then that night gazed" +
                  "at the " + getRandomNum() + " " + getAdjective2() + "fireworks shooting from the" +
                  getNoun3() + ".";
      }
      else{
          story="addy and her best friend " + getName() + "went to the zoo world last summer!" +
                  "they saw a huge" + getNoun1() + "and a tiny little" +getNoun2()+
                   "That night they decided to climb " + getAdverb() +
                  "into the" + getNoun3() + " to get a look." +
                  "the zoo was" + getAdjective1() + "at night ,but they didn't" +
                  " care...until "+getRandomNum()+" " + getAdjective2() +
                  "apes yelled on their faces, making addy and " +
                  getName() + "sprint all the way back home.";
      }
        setStory(story);

    }

    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        setRandomNum();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
             MadLibs game=new MadLibs();
             game.printInstruction();
             game.play();
    }
}
