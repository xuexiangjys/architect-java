package designpattern.behavior.memento;


/**
 * 游戏类
 *
 * @author xuexiang
 * @since 2020/3/28 11:52 PM
 */
public class Game {
    /**
     * 英雄状态属性
     */
    private HeroState mHeroState;

    /**
     * 场景状态属性
     */
    private SceneState mSceneState;

    public HeroState getHeroState() {
        return mHeroState;
    }

    public SceneState getSceneState() {
        return mSceneState;
    }

    public void sethState(HeroState hState) {
        mHeroState = hState;
    }

    public void setsState(SceneState sState) {
        mSceneState = sState;
    }

    /**
     * 备份游戏
     */
    public GameMemento createMemento() {
        System.out.println("游戏状态备份开始...");
        return new GameMemento(mHeroState, mSceneState);
    }

    /**
     * 玩游戏
     */
    public void play() {
        System.out.println("开始游戏，当前英雄生命值" + getHeroState().getHP());
        mHeroState.setHP(0);
        mHeroState.setMP(0);
        mSceneState.setCoin(0);
        mSceneState.setWood(0);
        System.out.println("游戏结束，当前英雄生命值" + getHeroState().getHP());
    }

    /**
     * 游戏还原
     */
    public void restore(GameMemento memento) {
        mHeroState = memento.getHeroState();
        mSceneState = memento.getSceneState();
        System.out.println("游戏状态还原结束");
    }

}
