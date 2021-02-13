package com.company;

public class Car {

         int      maxSpeed;
         int      minSpeed = 0;

         double   weight   = 3500;

         boolean  isTheCarOn;
         char     condition = 'A';
         String  nameOfCar="captain";

         double maxFuel=16;
         double currentFuel=8;
         double mpg=26.4;

         int numberOfPeopleInCar=1;

         public Car(int customMaxSpeed,double customWeight,boolean customIsTheCarOn){
                       maxSpeed = customMaxSpeed;
                       weight= customWeight;
                       isTheCarOn=customIsTheCarOn;
         }

    public void printVariable(){
        System.out.println("this is the max speed of car"+maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void upgradeMinSpeed(){
        minSpeed=maxSpeed;
        maxSpeed=maxSpeed+1;

    }

    public void getIn(){
             numberOfPeopleInCar++;
    }
    public void getOut(){
             numberOfPeopleInCar--;
    }

    public double maxMilePerFull() {
           return currentFuel*mpg;
    }

        public double runningOutOfGas(){
            return currentFuel*mpg;
        }
        public static void main(String[] args) {


            Car  gift= new Car(500,5000.55,true);
            gift.printVariable();


    }
}
