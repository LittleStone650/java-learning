package oopbasic;
/*

这是一个封装的例子：将所有的变量和函数封装在一个有意义的类中。
也是一个抽象的例子：降低代码的耦合性，通过将一些函数申明他们的作用域。尽量不要暴露在外层函数中，以导致他们被修改的时候，动所有的细节。

在这个类里边任何地方使用this，是值this class employee


 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;


    /*
    下面是使用构造函数来设置值和完成一些函数初始化的例子
     */
    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }


    public int calculateWage(int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }

    /*
    通过方法重载（overloading）来实现同一个方法，含有不同参数，实现同一种操作的事情。
     */
    public int calculateWage(){
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <=0)
            throw new IllegalArgumentException("Salary cannot be negative");
        else
            this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <=0)
            throw  new IllegalArgumentException("hourlyRate cannot be negative");
        else
            this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
