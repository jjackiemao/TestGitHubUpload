package LektionerWithAdam.Lektion4;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        //7.	Skapa en metod som skriver ut addition för dessa två tal. Skapa ett objekt och anropa denna metod ifrån en annan klass som har en main-metod

        //Calculator calc = new Calculator(firstNumber,secondNumber);
        //calc.add();

        //8.	Uppdatera din main-metod så att den läser in de två talen med Scanner


        // Läs in nummer
        Scanner scan = new Scanner (System.in);
        System.out.println("Please write a number: ");
        double firstNumber = Double.parseDouble(scan.nextLine());
        System.out.println("Please write another number: ");
        double secondNumber = Double.parseDouble(scan.nextLine());


        //skapa object
        Calculator calc = new Calculator(firstNumber,secondNumber);
        calc.add();

        //Anropa metoder för utskrifter
        calc.printSum();
        calc.printDiff();
        calc.printProduct();
        calc.printQuotient();

    }
}
