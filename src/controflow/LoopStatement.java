package controflow;

import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        //=======for loop==========
//        for (int i=0;i<5;i++){
//            System.out.println("helloWorld!");
//        }
        //========while loop  1============
//        int i=0;
//        while (i>0){
//            System.out.println("hello world" +i);
//            i--;
//        }
        //==========while loop  2============
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.println("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }
        //==========while loop 3 with break and continue=======
        // break 结束了loop，continue将回到loop的开始位置
        // 使用while true的时候，一定要有一个break的语句，否则将会进入死循环。
//        while (!input.equals("quit")){
//            System.out.println("input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;//当java看到continue时，会重新回到循环开始的位置,后面的语句也不会被执行
//            if (input.equals("quit"))
//                break;// 当java看到break时，它后面所有的条件都被忽略。
//            System.out.println(input);
//        }
        // ==============do while loop =========
        // 与while不同的是，它至少被执行一次
//        do {
//            System.out.println("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));

        // ==============for each loop=========
        // 限制项：只能向前循序执行，不能从后往前
        // 只能取值，不能取index
        String[] fruits = {"apple","mango","orange"};
        for (String fruit:fruits)
            System.out.println(fruit);



    }
}
