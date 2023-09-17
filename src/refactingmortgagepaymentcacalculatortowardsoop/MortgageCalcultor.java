package refactingmortgagepaymentcacalculatortowardsoop;

public class MortgageCalcultor {
    private final static int percent = 100;
    private final static int monthOfAnnual = 12;
    private int principal;
    private float annualInterestRate;
    private int period;

    public MortgageCalcultor(int principal, float annualInterestRate, int period) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.period = period;
    }

    public double calculateMortgage() {
        double monthlyInterestRate = getMonthlyInterestRate();
        int numPay = getNumPay();

        double mortgage = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numPay))
                / (Math.pow(1 + monthlyInterestRate, numPay) - 1);
        return mortgage;
    }


    public  double calculateBalance(short numberofPaymentsMade) {

        double monthlyInterestRate = getMonthlyInterestRate();
        int numPay = getNumPay();

//        double p = calculateMortgage(principal,annualInterestRate,period);

        double balance = principal * (Math.pow(1 + monthlyInterestRate, numPay) - Math.pow(1 + monthlyInterestRate, numberofPaymentsMade)) /
                (Math.pow(1 + monthlyInterestRate, numPay) - 1);

        return balance;
    }

    public double[] getRemainningBalances() {
        var balances = new double[getNumPay()];
        for (short month = 1; month <= balances.length; month++)
            balances[month -1] = calculateBalance(month);

        return balances;
    }
    private int getNumPay() {
        return period * monthOfAnnual;
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / percent / monthOfAnnual;
    }

}
