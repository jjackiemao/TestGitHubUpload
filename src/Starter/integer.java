package Starter;

public class integer {

    public static void main(String[] args) {

        int Number = 5;
        int N2 = 17;
        int N3 = 7;
        int nextNumber = 6;

        System.out.println(Number);
        System.out.println(nextNumber);
        System.out.println(Number + nextNumber);
        System.out.println(Number + nextNumber + N2 - N3);

        /* Matches island = 5;

        System.out.println(island); */


        Number = 5 + 3;
        nextNumber = Number + 1;


        System.out.println();
        System.out.println("Now updated to: ");
        System.out.println(Number);
        System.out.println(nextNumber);


        System.out.println("Update");
        //Number = number + 3
        Number +=3;
        System.out.println(Number);

        //nextNumber = nextNumber - 2;
        nextNumber -=0;
        System.out.println(nextNumber);

        System.out.println("Update 2.0");

        // += 1; number = number + 1;
        Number++;
        System.out.println(Number);

        nextNumber--;
        System.out.println(nextNumber);
    }
}
