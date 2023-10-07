package refactingmortgagepaymentcacalculatortowardsoop;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in); // 这里把scanner 提出来，并且 转成私有，
    // 是因为每使用一次readnumber，都会创造一个新的scanner，不如把这个scanner固定下来，仅创造一次。因此为static
    // 并且它仅仅只在console这个函数中被使用，是console函数里的私有。 因此为private
//@overloading
    public static double readNumber(String prompt) {
        return scanner.nextFloat();
    }
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
