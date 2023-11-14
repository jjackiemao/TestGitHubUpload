package ExercisesWithOnlineVideo.Exercise6;

public class Exercise2 {

    public static void main(String[] args) {

        Spellchecker spell = new Spellchecker();

        if (spell.isLetter('a')) {
            System.out.println("a is a letter");
        }
        if (spell.isLetter('A')) {
            System.out.println("A is a letter");
        }
        if (spell.isLetter('J')) {
            System.out.println("J is a letter");
        }
        if (spell.isLetter('b')) {
            System.out.println("b is a letter");
        }
        if (spell.isLetter('/')) {
            System.out.println("/ is a letter");
        }
    }
}
