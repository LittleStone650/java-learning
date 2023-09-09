package controflow;

public class IfStatement{
    public static void main(String[] args) {
//        int tempure = 32;
//        if (tempure > 30){
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }else if (tempure> 20 && tempure<=30) {
//            System.out.println("Beautifual day");
//        }else {
//            System.out.println("Cold day");
//        }

//        ==============超出代码块的变量定义=============
//        int income = 12_000;
//        if (income > 100_000) {
//            boolean hasHighIncome = true;
            //因为在代码块中的变量仅在这个代码块中有效，出了这个代码块，调用不到，所以这里会报错。
//        }
//        System.out.println(hasHighIncome);
//        }
        //========写判断的高级技巧===========
        int income= 120_000;
        boolean hasHighIncome = (income > 100_000);
        // 直接在boolean 里边写判断条件可以省略掉if
        //         boolean hasHighIncome = false;
        //        if (income > 1000_000)
        //            hasHighIncome = true;

        //=========turn operator 高级写判断的技巧========

        String className = income > 100_000 ? "First" : "Economy";
//        在变量里添加 "？ ：" 向java"提问"
        //等于
//        if (income > 100_000)
//            className = "First";
//        else
//            className="Economy";

        //===========switch statement===================
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("your are a moderator");
                break;
            default:
                System.out.println("your are a guest");

        }

    }
}
