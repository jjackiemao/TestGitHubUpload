package LektionerWithAdam.Lektion9;

import java.util.Arrays;

public class LogicArrays {

    public void printArray(String input){
        String[] tempArray = new String[10];//Vå måste på något sättt ange en längd på
        //vårt array när vi skapar det!
       String[] wordArray = input.split(" "); //Vi delar upp vår String i små delar
        // vid varje mellanslag och sparar varje del i separat i vårt nya array!

        // System.out.println(Arrays.toString(wordArray));
        // System.out.println(wordArray[0]);
        // System.out.println(wordArray[3]); //Vi får inte skriva ut ett index som inte existerar! Det ger Error!

        for (int i = 0; i < wordArray.length ;i++){
            System.out.println(wordArray[i]); //För att skriva ut varje ord för sig så kan vi
            // iterera igenom vårt array och kolla alla indexpositioner med hjälp av "i"


        }

    }

}
