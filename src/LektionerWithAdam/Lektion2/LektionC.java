package LektionerWithAdam.Lektion2;

import java.util.Scanner;

////13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
//modulooperatorn)

public class LektionC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = Integer.parseInt(scan.nextLine());
        if (number % 2 == 0) {
            System.out.println(number + " Is Even ");
        }else{
            System.out.println(number + " Is not even):");
        }
    }

}