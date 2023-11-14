package LektionerWithAdam.Lektion10;

public class Arrayaya {
    public static void main(String[] args) {


        int[] myArray = new int[]{1,2,3,4,5,6,6,7,8,9,1,12,33,-1,2,-66,-25,-11,2,5,4,2,1,99,2,256,1,2,255,21,-21,20,11};
        /*

        int counter = 0;
        for (int i = myArray.length - 1; i >= 0; i--){ //Vi kör en for loop som vandrar bakifrån själva arrayets längd.
            //vi får ta bort ett ifrån myArrays längd eftersom index och length är olika och vi inte vill gå out of bounds.
            if (myArray[i] < 0) {
                System.out.println("Sista negativa numret: " + myArray[i]);
                System.out.println("Sista negativa numret index: " + i);
                break; //Vi bryter loopen när vi hittat det första negativa talet.

            }
            //System.out.println(i);
        }


        String convertMe = "256";
        int convertedMe = Integer.parseInt(convertMe);
        int valueOf = Integer.valueOf(convertMe);

        System.out.println(convertMe);
        System.out.println(valueOf);
        */

        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) { //Vi kontrollerar om numret i myArray är större än noll
                positiveSum += myArray[i];

            }
            if (myArray[i] < 0) { //Vi kontrollerar om numret i myArray är mindre än noll
                negativeSum += myArray[i];
            }

        }
        System.out.println("Positive sum: " + positiveSum);
        System.out.println("Negative sum: " + negativeSum);

        int myNumber = 130;
        if (myNumber > 200) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
        System.out.println(myNumber > 200 ? "Bigger" : "Smaller");

        String myString = "Hej";
        int anotherNumber = myString.equals("Hejsan") ? 10 : 20;
        //Vi sätter värdet i anotherNumber beroende på om myString är = "Hej" eller inte.
        System.out.println(anotherNumber);

    }
}
