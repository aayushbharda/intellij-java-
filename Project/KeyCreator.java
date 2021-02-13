/*This program creates a numeric 5-digits key using input of 3 4-digit number and the last digit is a random number*/

package Project;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;



class A{

    int a = KeyCreator.sc.nextInt();
    int once,tens,hund,thou;

    A(){

        if (a >= 1000 && 9999 >= a) {
            once = a % 10;
            tens = (a / 10) % 10;
            hund = (a / 100) % 10;
            thou = (a / 1000) % 10;


        } else {
            System.out.println("ERROR! first number is not a four digit number.");
            System.exit(0);
        }
    }
}
class B{
    int b = KeyCreator.sc.nextInt();
    int onc,ten,hun,tho;

    B() {
        if (b >= 1000 && 9999 >= b) {
            onc = b % 10;
            ten = (b / 10) % 10;
            hun = (b / 100) % 10;
            tho = (b / 1000) % 10;
        } else {
            System.out.println("ERROR! second number is not a four digit number.");
            System.exit(0);
        }
    }
}
class C{
    int c =KeyCreator.sc.nextInt();
    int on,te,hu,th;

    C() {
        if (c >= 1000 && 9999 >= c) {
            on = c % 10;
            te = (c / 10) % 10;
            hu = (c / 100) % 10;
            th = (c / 1000) % 10;
        } else {
            System.out.println("ERROR! third number is not a four digit number.");
            System.exit(0);
        }
    }

}

class Compare{

    A a=new A();
    B b=new B();
    C c=new C();

    int ones() {
        int result;
        if (a.once < b.onc && a.once < c.on) {
            result = (a.once);
        } else if (c.on < a.once && c.on < b.onc) {
            result = (c.on);
        } else {
            result = (b.onc);
        }

        return result;
    }

    int tens(){
        int result;
        if (a.tens >b.ten && a.tens > c.te) {
            result =(a.tens);
        }
        else if (c.te > a.tens && c.te > b.ten) {
            result =(c.te);
        }

        else {
            result =(b.ten);
        }
        return result;
    }

    int hund(){
        int result;
        if (a.hund >b.hun && a.hund > c.hu) {
            result =(a.hund);
        }
        else if (c.hu > a.hund && c.hu > b.hun) {
            result =(c.hu);
        }

        else {
            result =(b.hun);
        }
        return result;
    }

    int thou(){
        int result;
        if (a.thou <b.tho && a.thou < c.th) {
            result =(a.thou);
        }
        else if (c.th < a.thou && c.th < b.tho) {
            result =(c.th);
        }

        else {
            result =(b.tho);
        }
        return result;
    }
}

public class KeyCreator {

    public static final Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        {

            System.out.print("Using Space In Between Enter Three 4-digit Number:");

            Random random = new Random();

            Compare ob = new Compare();

            int i = ob.ones();
            int j = ob.tens();
            int k = ob.hund();
            int l = ob.thou();
            int m = random.nextInt(9);

            System.out.printf("The Generated Key is %d%d%d%d%d", l, k, j, i, m);
            System.out.println();
        }
        long end = System.currentTimeMillis();

        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " milli-seconds");
    }

}