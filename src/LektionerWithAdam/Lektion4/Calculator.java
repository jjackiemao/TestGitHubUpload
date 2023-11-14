package LektionerWithAdam.Lektion4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    //6.	Skapa en class kallad Calculator som läser in två tal i konstruktorn och sparar dem som attribut
private double numberOne;
private double numberTwo;

public Calculator(double firstNumber, double secondNumber){
    numberOne = firstNumber;
    numberTwo = secondNumber;

}

public void add(){
    double sum = numberOne + numberTwo;
    System.out.println("The sum of the numbers is " + sum);
}

    //7.	Skapa en metod som skriver ut addition för dessa två tal. Skapa ett objekt och anropa denna metod ifrån en annan klass som har en main-metod


    //8.	Uppdatera din main-metod så att den läser in de två talen med Scanner


    //9.	Uppdatera Calculator så att den har liknande metoder för minus/delat med/gånger

public void printDiff(){
    double Diff = numberOne - numberTwo;
    System.out.println("The difference is: " + Diff);
}
public void printProduct(){
    double Prod = numberOne * numberTwo;
    System.out.println("The product is: " + Prod);

}
public void printSum(){
    double Sum = numberOne + numberTwo;
    System.out.println("The sum is: " + Sum);

}
public void printQuotient(){
    double Quotient = numberOne  / numberTwo;
    System.out.println("The Quotient is: " + Quotient);
}


}
