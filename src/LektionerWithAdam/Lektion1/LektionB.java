package LektionerWithAdam.Lektion1;

import java.util.Scanner;

public class LektionB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String myName = scan.nextLine();
        System.out.println("Hur mycket pengar du du?");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println(myName + " har såhär mycket pengar: ");
        for (int i = 1; i<=a; i++) {
            System.out.println(i);
        }
    }

    public static class test {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What's your name?");
            String name = scan.nextLine();
            System.out.println("How much money do you have?");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println(name + " have this much money: ");
            for (int i = 1; i<a; i++) {
                System.out.println(i);
            }
        }
    }
}
