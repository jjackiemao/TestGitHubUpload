package ExercisesWithOnlineVideo.Exercise2;

public class exercise2 {
    public static void main(String[] args) {
        int number1 = -1;
        int number2 = 3;

        if (number1 >= number2)
            System.out.println("number1 is larger or the same as/than number2");

        else if (number1 == number2)
            System.out.println("number1 is the same as number2");

        else
            System.out.println("number1 is smaller than number2");


        System.out.println("End of text");

        System.out.println("övning1");
        int first = 5;
        int second = 7;

        if (first > second)
            System.out.println ("första talet är störst");
        if (second > first)
            System.out.println("andra talet är störst");


        if (first % second == 0)
            System.out.println("jämt delbart");
        else
            System.out.println("inte jämt delbart");
    }
}
