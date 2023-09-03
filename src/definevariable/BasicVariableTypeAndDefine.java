package definevariable;

/*
java 有两个基本的变量类型，primitive和reference

primitive用来存储简单的变量：
byte（1 bytes），short（2 bytes），int （4 bytes），long（8 bytes）//整数
float（4 bytes），double（8 bytes）//小数
char （2 bytes）//简单字符
boolean （1 bytes）// 逻辑值
refernce用来存储复杂的对象

 */


import java.awt.*;
import java.util.Date;

public class BasicVariableTypeAndDefine {
    public static void main(String[] args){
        /*
        =========primitive variables =======================
         */
        byte age = 35;
        int viewsCount = 123_456_789; // 使用位数分隔符，使得大数字更容易读
        long viewsCountLarge = 3_123_456_789L; //在超过9位的整数后面，需要加L变成long type，否则不加L，java会认为这是个整数，但是会报超位错
        float price = 10.99F; //与long类似
        char letter= 'A';
        boolean isEligible = false;

        /*
        ==========reference variables ======================
         */

        Date now = new Date(); // reference 类型需要用 new 来占用内存，primitive不需要。now称作date class的实例（instance）
//        now.getTime();



        /*
        ==========primitive vs reference==========
         */

        //primitive之间的变量全部都是独立的内存占用
        byte x = 1;
        byte y = x;
        x = 2;
//        System.out.println(y); // y=1； 改变x的值，并不会改变y的值，因为x和y占用了不同的内存地址。


        // reference 与primitive不同。reference存储的是对象在内存中地址的lable，
        // 也就是说，reference是存的一个指向内存地址的link，而不是实际的内存地址中的值。
        Point point1 = new Point(1,1);
        Point point2 = point1; //记得要指定point2的类型是Point
        point1.x = 2;
//        System.out.println(point2); //改变point1，也会同时改变point2，因为它们指向的（refer the same address of memory）内存地址是一样的。


        /*
        ==============String===========
        是一个常用的reference type
         */
//
        String messges = "hello world!"; //same as String messges = new String("hello world!");
                                        // 因为string type常用，所以java用了一种类似primitive的表达来简单化。


        messges=messges+"!!";



//        System.out.println(messges);
        System.out.println(messges.endsWith("!!")); //return true
        System.out.println(messges.length()); //return 14
        System.out.println(messges.indexOf("h")); //return the position
        System.out.println(messges.replace("!","*")); //替换字符
        System.out.println(messges); //在string中，任何一次改变都会new一个新的对象，原始的值都不会改变。
        System.out.println(messges.trim());//去掉string首尾多余的空格
        System.out.println("hello \"world\""); //转义字符 与python一致


        /*
        ===================constants variable =====================
        如果赋值之后保证这个值以后不会被改变，怎么办
        创建常数变量,使用final
         */
        final float pi = 3.14F;
    }
}
