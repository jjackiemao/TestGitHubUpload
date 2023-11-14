package LektionerWithAdam.Lektion4;

public class Övning19 {
    public static void main(String[] args) {

        double timeWorkedWeek = 40;
        double hourlyPay = 142;

        if (timeWorkedWeek > 40) {
            double overTime = timeWorkedWeek - 40;
            double overTimePay = overTime * 1.5;
            double finalPay = (40 + overTimePay) * hourlyPay;
            System.out.println("Our total pay: " + finalPay);
        } else {
            System.out.println("Our total pay: " + (40*hourlyPay));
        }



    }
}
