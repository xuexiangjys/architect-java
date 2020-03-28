package designpattern.behavior.memento;

import java.util.Date;

/**
 * 英雄状态属性（原发器）
 *
 * @author xuexiang
 * @since 2020/3/28 11:59 PM
 */
public class HeroState implements Cloneable {

    /**
     * 生命值
     */
    private int HP;

    /**
     * 魔法值
     */
    private int MP;

    /**
     * 状态保存时间
     */
    private Date stateDate;

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public Date getStateDate() {
        return stateDate;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public void setMP(int mP) {
        MP = mP;
    }

    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }

    @Override
    protected HeroState clone() {
        try {
            return (HeroState) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
