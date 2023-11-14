package LektionerWithAdam.Lektion4;

public class FruitSalad {
    public static void main(String[] args) {

        //Creates fruit-object and chooses color-attribute
        Fruit myApple = new Fruit("Red Apple");
        Fruit myPear = new Fruit("Green Pear");
        Fruit myMelon = new Fruit("White Melon");
        Fruit myOrange = new Fruit("Orange Orange");
        Fruit myPineapple = new Fruit("Yellow Pineapple");

        //"Anropar" metod för att skriva ut färger
        String AppleColor = myApple.getColor();
        String PearColor = myPear.getColor();
        String MelonColor = myMelon.getColor();
        String OrangeColor = myOrange.getColor();
        String PinappleColor = myPineapple.getColor();

        String AllFruit = (AppleColor + ", " + PearColor + ", " + MelonColor + ", " + OrangeColor + " and a " + PinappleColor);

        System.out.println("Your fruitsalad has these colors " + AllFruit);

    }
}
