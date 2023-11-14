package ExercisesWithOnlineVideo.Exercise4;

public class myCar {
    public static void main(String[] args) {
        //Skapa ett nytt object myCar av typen Car
        Car myCar = new Car();

        System.out.println(myCar.getColor());

        //Ändra på myCar genom att sätta färgen till Blue
        myCar.setColor("Blue");

        //Hämta info ifrån myCar i detta fall bilfärgen Blue
        String color = myCar.getColor();

        System.out.println(color);

    }
}
