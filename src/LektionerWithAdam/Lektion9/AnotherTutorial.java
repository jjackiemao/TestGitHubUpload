package LektionerWithAdam.Lektion9;

import java.util.Scanner;

public class AnotherTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 1000;
        System.out.println("Please enter interest rate (1.xx format)");
        double interestRate = Double.parseDouble(scan.nextLine());

        for (int i = 0; i <10; i++){
            sum = sum * interestRate;
            System.out.println("Total sum after " + (i + 1) + " years is :" + sum);
        }
    }
}
