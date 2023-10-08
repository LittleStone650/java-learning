package interfaceExample;

public class InterfaceMain {
    public static void main(String[] args) {

        // dependency injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);
//        report.setCalculator();
        report.show(new TaxCalculator2019());
    }
}
