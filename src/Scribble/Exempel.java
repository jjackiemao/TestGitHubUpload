package Scribble;

import java.util.Scanner;

public class Exempel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Write break to quit");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("break")){
                System.out.println("Breaking");
                break;
            }

        }
    }
}
