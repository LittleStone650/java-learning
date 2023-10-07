package refactingmortgagepaymentcacalculatortowardsoop;

public class MorgagePaymentCalculatoroop {
    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal",1000,1000000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate ",1,30);
        int period = (int) Console.readNumber("Period (years): ",1,30);

        var calculator = new MortgageCalcultor(principal,annualInterestRate,period);
        // 用已经获取到的 principal annualInterestRate period 来初始化 MortgageCalcultor。

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
