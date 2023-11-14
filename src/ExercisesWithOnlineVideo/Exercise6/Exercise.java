package ExercisesWithOnlineVideo.Exercise6;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        //Läs in en String
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        //Om man skriver ordet "ägg" så skrivs menging "ägg är knasigt" ut.
        if (text.equals("ägg"))  {
            System.out.println("ägg är knasigt");
        } else

        //int textLength = myString.length();??

        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
        //System.out.println(text.charAt(i)); --> Är alternativ för System.out.print(text.charAt(i) +" ");
        for (int i=0;i<text.length();i++) {
            System.out.print(text.charAt(i) +" ");
        }

        //Om man skriver ordet "ägg" så skrivs menging "ägg är knasigt" ut.
       /* if (text.equals("ägg"))  {
            System.out.println("ägg är knasigt");
        } */

    }
}
