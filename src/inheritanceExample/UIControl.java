package inheritanceExample;

public abstract class UIControl {
    protected boolean isEnabled = true;
    // 除了public，private，还有一个访问修饰符叫protected
    // 这个访问修饰符protected仅在一个包里起作用，如这里的isEnabled仅在inheritanceExample这个包中是可见的，出了这个包都不行。
    // 一般不要用
//    public UIControl(boolean isEnabled) {
//        this.isEnabled = true;
//        System.out.println("UIControl");
//    }



    public abstract void render();
    //这里的render方法，在UIControl中并没有任何动作，它存在的目的就是为了让别人重载它，为此，UIControl整个类其实就是一个abstract 类。
    //当我们构造了一个abstract类，我们不能实例化它，只能继承它并且改写它。

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
