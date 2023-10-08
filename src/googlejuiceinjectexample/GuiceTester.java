package googlejuiceinjectexample;

import com.google.inject.Guice;
import com.google.inject.Injector;

//测试函数中，直接调用了TextEditorModule，Module里绑定了接口和实现的关系
//然后 实例化了 editor 用 injector.getInstance
//最后editor 可以提取TextEditor里边所有的 变量 和 方法

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
        editor.printTest();
    }
}
