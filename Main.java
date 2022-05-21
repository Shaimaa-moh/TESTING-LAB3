package myfirstproject;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    Coffee_Machine c = new Coffee_Machine();
    c.selection (x);
    }
}
