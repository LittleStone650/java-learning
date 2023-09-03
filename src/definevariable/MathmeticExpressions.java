package definevariable;

public class MathmeticExpressions {
    public static void main(String[] args) {
        int result = 10+3;
        System.out.println(result);


        double result1 = (double) 10/ (double) 3; //强制转换类型，把整数转换成了浮点数
        System.out.println(result1);


        int x = 1;
        x++; //自增
//        System.out.println(x);

        /*
        ==================++x vs x++=============
         */
        int x1 = 1;
        int y = x1++; //首先x1会赋值给y，然后x1在自增。先赋值再自增
        System.out.println(x1);
        System.out.println(y);

        int x2 = 1;
        int y1 = ++x2; //先自增，再赋值
        System.out.println(x2);
        System.out.println(y1);


        /*
        ==========自增任意数=============
         */

        int x3 = 1;

        x3 += 2;// same as x3 = x3+2;
        System.out.println(x3);



        /*
        =========计算顺序=============
        括号最高级
        接着是乘除
        最后是加减

         */



    }
}
