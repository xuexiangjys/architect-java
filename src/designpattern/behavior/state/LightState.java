package designpattern.behavior.state;

/**
 * 灯的状态
 *
 * @author xuexiang
 * @since 2020/3/29 12:13 AM
 */
public interface LightState {

    void pressSwitch(Light light);

    String stateName();
}
