package Scribble;

public class FruitTest {//Skapa en class kallad Fruit som beskriver olika frukter
    //Attributet som definieras i konstruktorn heter color och är fruktens färg

    private String color;
    private String name;

    public FruitTest(String fruitColor,String fruitName){
        color = fruitColor;
        name = fruitName;
    }
    //Utöka Fruit så att den kan skriva ut färgen på frukten
    public void printColor(){
        System.out.println("The fruit is " + color);
    }
    public void printInfo() {
        System.out.println(name + " is " + color);
    }
}
