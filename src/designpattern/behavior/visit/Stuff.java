package designpattern.behavior.visit;

/**
 * 员工基类
 *
 * @author xuexiang
 * @since 2020/3/29 12:22 AM
 */
public abstract class Stuff {
    /**
     * 员工名称
     */
    public String name;
    /**
     * 绩效
     */
    public int kpi;

    public Stuff(String name) {
        super();
        this.name = name;
    }

    /**
     * 接受访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
