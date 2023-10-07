package inheritanceExample;

public class TextBox extends UIControl{
    private String text;

//    public TextBox() {
//        super(true); //出现super说明它继承自某一个类，并且那个类的构造函数需要传入参数。为此在这里用super来显式的将参数传入
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
//        super.render();
        System.out.println("Render TextBox");
    }

    @Override // 这里用了重写这个方法，是在这个类里重写它继承自其他类的方法，实现它想实现的内容。
    public String toString(){
        return text;
    }



    public void setText (String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}
