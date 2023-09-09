package controflow;

import java.util.Scanner;

public class ExcesizeTwoConditionStatement {
    // 如果能被5整除，返回Fizz. 如果能被3整除，返回Buzz。如果同时能被5和3整除，返回FizzBuzz. 如果不能被5和3整除，返回数字本身
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number%5==0 && number%3==0)
            System.out.println("FizzBuzz");
        else if (number %3 ==0)
            System.out.println("Buzz");
        else if (number%5==0) {
            System.out.println("Fizz");
        }
        else
            System.out.println(number);

    }




}
