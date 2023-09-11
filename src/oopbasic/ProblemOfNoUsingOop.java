package oopbasic;
/*
过程式编程的示例
大部分计算科学家都是这样的编程方式

主要的问题是：
（1）不好维护。太多负责的关系，动一个其他都得动，导致不好维护。
（2）复用性很差。不能在其他地方调用它。只能靠粘贴复制。
想要解决这些问题，就需要oop思维。
 */
public class ProblemOfNoUsingOop {
    public static void main(String[] args) {
        var employee = new Employee(50_000,20);
        /*
        用构造函数(constructor)来赋值，而不是使用下面这种显式的（setter和getter）赋值方式。
        构造函数的好处是可以进一步减少代码量，并且使得代码变得更加清晰。

        //        employee.setBaseSalary(50_000);
        //        employee.setHourlyRate(20);
         */

        /*封装和抽象
        用setter和getter函数赋值，以在赋值函数设置一些规则，来判断赋值是否是正确的，符合意义的。
        而不是使用显式的赋值。
        //        employee.baseSalary = 50_000;
        //        employee.hourlyRate = 20;
         */

//        int wage = employee.calculateWage(10);
        int wage = employee.calculateWage();// overloading
        System.out.println(wage);

    }

//    public static void main(String[] args) {
//
//
//    int baseSalary = 50_000;
//    int extraHours = 10;
//    int hourlyRate = 20;
//
//    int wage = calculateWage(baseSalary,extraHours,hourlyRate);
//        System.out.println(wage);
//    public static int calculateWage(
//            int baseSalary,
//            int extraHours,
//            int hourlyRate
//    ) {
//        return baseSalary+(extraHours*hourlyRate);
//    }
//    }
}
