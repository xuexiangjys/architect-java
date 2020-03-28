package designpattern.behavior.memento;

/**
 * 备忘录模式：在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/29 12:03 AM
 */
public class MementoTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //初始化游戏状态（原发器）
        HeroState hState = new HeroState();
        hState.setHP(100);
        hState.setMP(100);
        SceneState sState = new SceneState();
        sState.setCoin(1000);
        sState.setWood(1000);

        //初始化游戏
        Game game = new Game();
        game.sethState(hState);
        game.setsState(sState);

        //构建备忘录存储状态（备忘录）
        GameMemento memento = game.createMemento();
        MementoManager ct = new MementoManager();
        ct.setMemento(memento);

        //开始游戏，原发器发生变化
        game.play();

        //原发器状态恢复
        game.restore(ct.getMemento());
        System.out.println("当前英雄生命值" + game.getHeroState().getHP());
    }

}
