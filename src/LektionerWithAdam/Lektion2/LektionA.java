package LektionerWithAdam.Lektion2;

import java.util.Scanner;

public class LektionA {
    public static void main(String[] args) {

        //11.Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.

        printBuggestNumber();
        System.out.println("Test one complete");
        printBuggestNumber();
        System.out.println("Test two complete");
        printBuggestNumber();
    }
    public static void printBuggestNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.println("Type another number");
        int numTwo = Integer.parseInt(scan.nextLine());

        if (numOne > numTwo) {
            System.out.println(numOne + " is bigger than " + numTwo);

        } else if (numTwo > numOne) {
            System.out.println(numOne + " is not bigger than " + numTwo);

        }


    }
}
