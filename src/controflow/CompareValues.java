package controflow;

public class CompareValues {
    public static void main(String[] args) {
        // =============compare operators===============
//        int x = 1;
//        int y = 2;

//        System.out.println(x != y);

        // =============logical operators v1==============

//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature <30; //&& meanings and
//        System.out.println(isWarm);

        // =============logical operators v2==============
        // 链式法则
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || meanings or
        // 这个人有高收入或者高信用，并且没有犯罪记录就可以发卡


    }

}
