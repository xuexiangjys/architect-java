package designpattern.behavior.state;

/**
 * 状态模式的核心思想是：当对象的状态改变时，同时改变其行为。
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924918
 *
 * @author xuexiang
 * @since 2020/3/29 12:16 AM
 */
public class StateTest {

    public static void main(String[] args) {

        Light light = new Light(new LightOff());
        light.PressSwitch();
        light.PressSwitch();

        System.out.println("最终灯的状态: " + light.getLightState().stateName());
    }
}
