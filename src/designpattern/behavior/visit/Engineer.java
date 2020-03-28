package designpattern.behavior.visit;

import java.util.Random;

/**
 * 技术工程师
 *
 * @author xuexiang
 * @since 2020/3/29 12:24 AM
 */
public class Engineer extends Stuff {
    /**
     * 代码行数
     */
    private int codeLines;

    public Engineer(String name) {
        super(name);
        codeLines = new Random().nextInt(100000);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return 返回工程师的代码行数
     */
    public int getCodeLines() {
        return codeLines;
    }

}
