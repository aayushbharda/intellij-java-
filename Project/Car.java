package Project;

public class Car {

         int      maxSpeed = 100;
         int      minSpeed = 0;
         double   weight   = 3500;
         boolean  isTheCarOn = false;
         char     condition = 'A';

    public void printVariable(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public static void main(String[] args) {

        Car captain = new Car();
        captain.printVariable();


    }
}
