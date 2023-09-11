package oopbasic;

/*
class is a blueprint or template
object is a instance of class
each objects are independent, so they are totally different.
 */


public class UnderstandingClassAndObjects {
// see TextBox to understand how to creat a class
public static void main(String[] args) {

    // 实例化一个对象  (是不是只能在main函数里实例化对象)
    TextBoxExample textBox1 = new TextBoxExample(); //这里可以使用 var texBox1 = new TextBoxExample();
    //等号左边（引用，reference）存在stack上，右边（object）是heap
    textBox1.setText("Box 1");
    System.out.println(textBox1.text);

    var textBox2 = new TextBoxExample();// 使用var可以让java来判断这个textBox2的变量类型。
    textBox2.setText("Box 2");
    System.out.println(textBox2.text);


    var textBox3 = textBox2;
    textBox3.setText("hello");
    System.out.println(textBox2.text); //这里textBox3和textBox2指向了同一个内存引用的地方。所以修改3，2也会变
}

}
