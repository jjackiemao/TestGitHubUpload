package LektionerWithAdam.Lektion2;

import java.util.Scanner;

public class LektionB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.println("Write a second number");
        int bumTwo = Integer.parseInt(scan.nextLine());

        if (numOne >= (bumTwo*2))
            System.out.println("First number is too big");
    }
}
