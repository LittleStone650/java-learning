package googlejuiceinjectexample;

import com.google.inject.Inject;
// 这里新建了一个texteditor作为一个示例类
// 在这个类中，要实现 spellcheacker的功能
// texteditor的构造函数中inject了spellcheacker，然后spellchecker做了一系列动作


public class TextEditor {

    private final SpellChecker spellChecker;

    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }

    public void printTest(){
        System.out.println("ojbk!");
    }
}
