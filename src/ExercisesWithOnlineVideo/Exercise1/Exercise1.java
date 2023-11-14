package ExercisesWithOnlineVideo.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        1.Skapa ett program som använder 3 tal
        Pragrammet beräknar och skriver ut summan samt medelvärdet av de 3 talen

        2.Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in. */

        // 1.
        int number1 = 7;
        int number2 = 17;
        int number3 = 77;

        int Total = number1 + number2 + number3;
        int Median = Total/3;

        System.out.println("The sum is: " +Total);
        System.out.println("The median is: " +Median);

        // 2.
        int height = 3;
        int Width = 5;

        int Area = height * Width;
        int Circ = height*2 + Width*2;

        System.out.println();

        System.out.println(Area);
        System.out.println(Circ);




    }
}
