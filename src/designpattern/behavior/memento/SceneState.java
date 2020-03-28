package designpattern.behavior.memento;

/**
 * 场景状态（原发器）
 *
 * @author xuexiang
 * @since 2020/3/29 12:01 AM
 */
public class SceneState implements Cloneable {
    /**
     * 金币数量
     */
    private int Coin;

    /**
     * 木材数量
     */
    private int Wood;

    /**
     * 地图名称
     */
    private String MapName;

    public int getCoin() {
        return Coin;
    }

    public int getWood() {
        return Wood;
    }

    public String getMapName() {
        return MapName;
    }

    public void setCoin(int coin) {
        Coin = coin;
    }

    public void setWood(int wood) {
        Wood = wood;
    }

    public void setMapName(String mapName) {
        MapName = mapName;
    }

    @Override
    protected SceneState clone() {
        try {
            return (SceneState) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
