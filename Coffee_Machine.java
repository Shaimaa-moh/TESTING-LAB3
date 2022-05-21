package myfirstproject;
import java.util.Scanner;
public class Coffee_Machine {
    public void start() {
        System.out.println("please enter your drink");
        System.out.println("1.latte");
        System.out.println("2.Espresso");
        System.out.println("3.Mocha");
        System.out.println("4.cappuccino");
    }
    public int Order_coffee(int type, int amount) {
        Coffee_machine_stubs c = new Coffee_machine_stubs();
        Boolean accept = c.check(type, amount);
        if (accept == true) {
            float money = c.price - (float) type;
            int cof_Amount = c.Amount - amount;
            System.out.println("the remaining  money is " + money);
            System.out.println("You can fill your cup up to  " + cof_Amount);

            return 1;
        }
        else
        {
            System.out.println("an error occured");
            return 0;
        }

    }
    int timerLimit = 10;
    int coffeeCupTime = 7;
    public void timer() {
        for (int i = 0; i <= timerLimit; i++) {
            if (coffeeCupTime > timerLimit) {
                break;
            } else {
                System.out.println("your cup is ready");
            }
        }
    }
    public void finish() {

        System.out.println("\nFilling...");
        System.out.println("Filling Completed.");
        System.out.println("if you want to exit press 1 or you can continue ordering");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x != 1) {
            selection(x);

        }
    }

    public int selection(int x) {

        start();
        finish();

       return 1;
    }

    }











