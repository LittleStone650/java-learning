package definevariable;

/*
Array
 */


import java.util.Arrays;

public class ListAndArray {
    public static void main(String[] args) {
        /*
        ============array=============
        java中的list，array是不可以变长的。创建了几个元素的array就是几个
         */
        // 创建一个空的array，然后array中每一个元素赋值
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[10] = 3; //超界错误，因为我们只有5个元素位置，但是想给第10个元素增加
//        System.out.println(numbers); //看不到numbers的list中每一个实际的值，只能看到所在内存地址。因为sout只打印字符串。

        System.out.println(Arrays.toString(numbers));//通过Arrays的方法中的toString来获取list中的每一个元素，并且转换成字符。

        // 已知array中每一个元素的值，创建array
        int[] numbers1 = {5,2,3,4,1};
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        /* tips
        ===========method overloading===============
        Arrays.toString(int[] a),Arrays.toString(char[] a),Arrays.toString(float[] a)
        这种方法名字一样，传入参数不一样，返回的值一样或者不一样的玩意，就叫overloading，方法重载。
         */


        /*
        ============multi-dimensitonal arrays==========
         */

        int[][] matrix1 = new int[2][3]; //创建空的list，之后再赋值
        matrix1[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix1)); //Arrays.toString用于1维，deepToString 用于高纬

        int[][] matrix2 = {{1,2,3},{4,5,6}}; //已知value，创建list
        System.out.println(Arrays.deepToString(matrix2));




        /*
        =================casting And Type transfer=============

         */

    }
}
