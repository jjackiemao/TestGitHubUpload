package LektionerWithAdam.Lektion1;

import java.util.Scanner;

public class LektionC {
    public static void main(String[] args) {
        /*1. Skapa ett program som skriver ut kvadraten på ett tal som läses in. Kvadrat är talet
multiplicerat med sig själv*/

       /* int baseNumber = 24;
        System.out.println(baseNumber * baseNumber);

        //Förbättring
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = Integer.parseInt(scan.nextLine());
        int result = number*number;
        System.out.println("Your Result is " + result); */


        System.out.println("-----------------------------------------");

/* 2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
försäljningssumman. Skapa ett program som beräknar lönesumman under en period Försäljningssumman ska läsas in.
        int lön = 8000;
        int försäljningssumman = 30000;
        System.out.println("Han har " + (lön + försäljningssumman*0.09) + " i total månadslön");
        */

        //Förbättring
        Scanner scan = new Scanner(System.in);
        System.out.println(" Hur mycket har du sålt för den här månaden?");
        int sales = Integer.parseInt(scan.nextLine());
        int wages = 8000 + sales/100*9;
        System.out.println(" Din lön den här månaden är " + wages + " kr ");


        //System.out.println(------------------------------------------);
        /* 3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
blir omvandlat till minuter resp sekunder.  */
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours = 1+1;
        int total = hours * 1;
        int minutes = 60*total;
        int seconds = 3600*total;

        int hour = Integer.parseInt(scan.nextLine());

        System.out.println(" Is calculated to be " + total * minutes + " minutes ");
        System.out.println(" Which equals " + total * seconds + " seconds");*/

       /*System.out.println("Förbättring");
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in antal timmar: ");
        int timmar = Integer.parseInt(scan.nextLine());
        int minuter = timmar * 60;
        int sekunder = minuter * 60;
        System.out.println(timmar + " timmar är lika med " + minuter + " minuter och " + sekunder + " sekunder");*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Put in total hours");
        int Hours = Integer.parseInt(scan.nextLine());
        int minutes = Hours * 60;
        int seconds = minutes * 60;
        System.out.println(Hours + " Hours is " + minutes + " Minutes and " + seconds + " Seconds. ");*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Type in values");
        int one = 7;
        int two = 17;
        int three = 77;
        int total = one + two + three;
        int averageValue = total/3;
        System.out.println(" The sum is " + total + " and the average value is " + averageValue);*/

        /*System.out.println("Förbättring");
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.println("Second number");
        int numTwo = Integer.parseInt(scan.nextLine());
        System.out.println("Third number");
        int numThree = Integer.parseInt(scan.nextLine());

        int sum = numOne + numTwo + numThree;
        int average = sum/3;

        System.out.println("The sum is " + sum + " and the average value is " + average); */


    }
}
