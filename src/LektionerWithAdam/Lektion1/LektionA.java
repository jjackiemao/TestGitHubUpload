package LektionerWithAdam.Lektion1;

import java.util.Scanner;

public class LektionA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String test = scan.nextLine();
        String myName = "Mitt namn är Jackie";
        String Ålder = ", jag är 24 år gammal";
        String Hemort = ", jag bort i Malmö";
        String Favoritband = " och mitt favoritband är OOGABOOGA.";
        System.out.println(myName + Ålder + Hemort + Favoritband);

        System.out.println("Alternativ");
        String name = "Jackie";
        String age = "24";
        String city = "Malmö";
        String music = "OOOUGABOOOOGA";
        System.out.println(" my name is " + name + " i am " + age + " i live in " + city + " i favourite band is " + music);



    }
}
