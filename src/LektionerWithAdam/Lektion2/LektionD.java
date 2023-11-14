package LektionerWithAdam.Lektion2;

import java.util.Scanner;

public class LektionD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number");
        int number1 = scan.nextInt();
        System.out.print("Enter another Number");
        int number2 = scan.nextInt();
        if (number1 % number2 == 0) {
            System.out.println(number1 + " Is evenly divisible ");
        }else{
            System.out.println(number1 + " Is not evenly divisible):");
        }
    }
}
