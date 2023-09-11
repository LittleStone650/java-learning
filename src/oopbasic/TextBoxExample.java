package oopbasic;

public class TextBoxExample {
    public String text; //Field

    public void setText (String text) {
        this.text = text;// this.text 意思是引用上边创建的public String text，
                         // 用setText方法里的参数（text）给 上边创建的filed赋值。
    }

    public void clear() {
        this.text = "";
    }

}
