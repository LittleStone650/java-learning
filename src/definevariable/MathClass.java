package definevariable;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class MathClass {
    public static void main(String[] args) {
        float x = 1.1F;
        int result = Math.round(x);
        System.out.println(result);

        int result1 = (int) Math.ceil(1.1F); //大于等于1.1的第一个整数
        System.out.println(result1);

        int result2 = (int) Math.floor(1.1F); //小于等于1.1的第一个整数
        System.out.println(result2);

        /*
        ===========formatting number===========
         */

//        NumberFormat currency = new NumberFormat() ; //抽象类不能被new，abstract class can't be new a instance

        NumberFormat currency = NumberFormat.getCurrencyInstance();  //使用factory method 创建一个新的object
        String result3 = currency.format(1234345.123);
        System.out.println(result3);



        NumberFormat percent = NumberFormat.getPercentInstance();  //使用factory method 创建一个新的object
        String result4 = percent.format(0.123);
        System.out.println(result4);


       //method chaining
        String result5 = NumberFormat.getPercentInstance().format(0.123);
        System.out.println(result5);

    }
}
