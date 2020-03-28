package designpattern.behavior.state;

/**
 * 关灯状态
 *
 * @author xuexiang
 * @since 2020/3/29 12:15 AM
 */
public class LightOff implements LightState {

    @Override
    public void pressSwitch(Light light) {
        System.out.println("当前灯的状态：" + stateName());
        System.out.println("==正在开灯==");
        light.setLightState(new LightOn());
    }

    @Override
    public String stateName() {
        return "灯关了";
    }

}
