package LektionerWithAdam.Lektion5;

import java.util.Scanner;

public class BankKonto {
    public static void main(String[] args) {

        //Vi har skapat ett objekt av klassen BankAccount
        //Som vi döper till jackie och vi skickar in 1000 till myBalance.
        BankAccount jackieAcc = new BankAccount(100000, "Jackie");
        BankAccount jackAcc = new BankAccount(-7000, "Jack");

        Scanner scan = new Scanner(System.in);

        while (true){
            int amount;
            System.out.println("Welcome to imaginary bank, " + jackieAcc.getName());
            System.out.println("1,Check balance ");
            System.out.println("2.Set balance ");
            System.out.println("3.Withdraw ");
            System.out.println("4.Deposit ");
            System.out.println("5.Exit ");
            int input = Integer.parseInt(scan.nextLine());

            if (input == 1){
                System.out.println("Current balance: " + jackieAcc.getBalance());


            } else if (input == 2) {
                System.out.println("Nytt Saldo: ");
                amount = Integer.parseInt(scan.nextLine());
                jackieAcc.setBalance(amount);
            } else if (input == 3) {
                System.out.println("Skriv summa att ta ut: ");
                amount = Integer.parseInt(scan.nextLine());
                jackieAcc.withdraw(amount);
            } else if (input == 4) {
                System.out.println("Skriv summa att sätta in: ");
                amount = Integer.parseInt(scan.nextLine());
                jackieAcc.deposit(amount);
            } else if (input == 5) {
                System.out.println("Session avslutad");
                break;

            }

        }

        //Vi kallar på objektet jackieAcc och använder metoden printBalance för att skriva ut vårt balance.
        //jackieAcc.printBalance();

        //Vi sätter ett nytt värde igenom att kalla på vår nya metod (setBalance)
        //jackieAcc.setBalance(2000);
        //Vi kontrollerar att ändringen är gjord!
        //jackieAcc.printBalance();
        //Vo gör insättningen med vår deposit metod
        //jackieAcc.deposit(200);
        //Vi kontrollerar att ändringen är gjord!
        //jackieAcc.printBalance();
        //Vi gör ett uttag och kontrollerar att värdet sparats!
       // jackieAcc.withdraw(200);
        //jackieAcc.printBalance();

        //jackAcc.withdraw(1000);
        //jackAcc.printBalance();


    }

    //10. Skapa ett program BankAccount som kan hålla
// koll på hur stort saldo man har (pengar på sitt konto)
//11.  Utöka programmet så att man kan skriva ut
// saldot
//12.  Utöka programmet så att man kan bestämma
// ett nytt värde för saldo
//13.  Utöka programmet så att man kan lägga till
// och ta bort en viss summa ifrån saldot
//14.  Utöka programmet så att man aldrig kan få ett
// saldo som är mindre än 0 kronor



}
