package googlejuiceinjectexample;

import com.google.inject.AbstractModule;
// 新建了一个Module用来绑定 实现类 和 接口类
public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        // 在这里把 SpellCheckerImpl 绑定给了 SpellChecker
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }

}
