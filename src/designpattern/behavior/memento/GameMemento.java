package designpattern.behavior.memento;

/**
 * 游戏备忘录（备忘录）
 *
 * @author xuexiang
 * @since 2020/3/28 11:57 PM
 */
public class GameMemento {

    /**
     * 英雄状态属性
     */
    private HeroState mHeroState;

    /**
     * 场景状态属性
     */
    private SceneState mSceneState;

    /**
     * 构造方法
     *
     * @param hState
     * @param sState
     */
    public GameMemento(HeroState hState, SceneState sState) {
        mHeroState = hState.clone();
        mSceneState = sState.clone();
    }

    /**
     * 获取备份状态
     *
     * @return
     */
    public HeroState getHeroState() {
        return mHeroState;
    }

    /**
     * 获取备份状态
     *
     * @return
     */
    public SceneState getSceneState() {
        return mSceneState;
    }
}
