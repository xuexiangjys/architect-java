package designpattern.behavior.memento;

/**
 * 备忘录管理
 *
 * @author xuexiang
 * @since 2020/3/29 12:02 AM
 */
public class MementoManager {

    /**
     * 游戏备忘录
     */
    private GameMemento memento;

    public GameMemento getMemento() {
        System.out.println("游戏状态还原开始...");
        return memento;
    }

    public void setMemento(GameMemento memento) {
        this.memento = memento;
        System.out.println("游戏状态备份完成");
    }

}
