package Starter;

public class Operations {

    public static void main(String[] args) {

         /*
                + Addition
                - Subtraktion
                * Multiplikation
                / Division
                % modulus (resten av en division)

        7 % 3 = 1
        25 % 5 = 0
        137 % 10 = 7
        */

        int number = 5;
                int number2 = 6;

                number = number2 *3 + 2;
                number2 = number / 7;


        System.out.println(number);
        System.out.println(number2);


        // 7 / 3 = 2 +  resten 1
        System.out.println("Update");
        int N1 = 7% 3;
        int N2 = 25% 5;
        // 137/10 = 13,7 // 10*13 = 130 ( 13 + resten 7)
        int N3 = 137% 10;

        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);







    }
}
