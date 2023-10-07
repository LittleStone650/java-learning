package inheritanceExample;

public class InheritanceMain {
    public static void main(String[] args) {
//        var box1 = new TextBox();
//        var box2 = new TextBox();
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

        //=============override toString method==============
//        var box = new TextBox();
//        box.setText("hello world");
//        System.out.println(box.toString());

        // ==========upcasting and downcasting============
//        var control = new UIControl(true);
//        var textbox = new TextBox();
//        show(textbox);

        //==========object comparing =============  override equals and hashcode method
//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
////        System.out.println(point1.equals(point2));
////        System.out.println(point1.equals(new TextBox()));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        //=========多态 Polymorphism ===============
        // ploy 意思是many， morph 意思是 form
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control: controls){
            //========如果想要实现一个页面布局多个控制组件，例如文本框，选择框，并且在各自的组件里添加对应的元素。
            // 那么下面的代码可能是写出来的。更糟糕的是，如果每次修改下UIControl，textbox和checkbox都需要修改一遍
            // 这时你就可以使用多态
                // if control is TextBox
                //    renderTextBox
                // if control is a CheckBox
                //    renderCheckBox

            // ===可以在UIControl 中建立一个render的方法，并且在checkbox和textbox中 overide 这个方法，使其各自实现各自的功能 ===
            // ===随后control就可以调用它，并且是在不同的object中
            control.render();
        }

       }

//    public static void show(UIControl control) {
//        System.out.println(control);
//    }
}
