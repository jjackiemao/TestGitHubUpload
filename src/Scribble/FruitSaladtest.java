package Scribble;

public class FruitSaladtest {public static void main(String[] args) {
    //Skapa tre olika Fruit ifrån main-metod i en annan klass FruitSalad
    FruitTest banana = new FruitTest("yellow","Banana");
    FruitTest apple = new FruitTest("red", "Apple");
    FruitTest rambutan = new FruitTest("brown", "Rambutan");
    //Anropa denna metod för de tre frukterna i FruitSalad

    banana.printColor();
    apple.printColor();
    rambutan.printColor();
    banana.printInfo();
}
}
