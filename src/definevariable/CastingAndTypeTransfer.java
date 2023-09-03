package definevariable;

public class CastingAndTypeTransfer {
    public static void main(String[] args) {

        /*
        ===========同类型转换==============
         */

        // Implicit casting 隐式转换 自动转换
        //byte ==> short ==> int ==> long ==> float ==> double
        short x = 1;
        int y = x+2;
        System.out.println(y);

        // explicitly casting 显式转换

        double x1 = 1.1;
        int y1 = (int)x1 +2;
        System.out.println(y1);


        /*
        =============不同类型转换===========
        借助每一个种primitive 的reference 来进行转换
         */
        String x2 = "1";
        int y2 = Integer.parseInt(x2)+1;
        System.out.println(y2);

        double x3 = Double.parseDouble(x2)+1.1;
        System.out.println((int)x3);

    }
}
