package ExercisesWithOnlineVideo.Exercise5;

public class PetZoo {

    public static void main(String[] args) {
        Pet dog = new Pet("Fido");
        Pet cat = new Pet("Panda");
        Pet Turtle = new Pet("Bigboi");


        //dog.printName();
        //cat.printName();
        //Turtle.printName();

        String dogName = dog.getName();
        String catName = cat.getName();
        String TurtleName = Turtle.getName();

        for (int i=0;i<2;i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(TurtleName);
        }

    }
}
