package designpattern.behavior.state;

/**
 * 开灯的状态
 *
 * @author xuexiang
 * @since 2020/3/29 12:14 AM
 */
public class LightOn implements LightState {

    @Override
    public void pressSwitch(Light light) {
        System.out.println("当前灯的状态：" + stateName());
        System.out.println("==正在关灯==");
        light.setLightState(new LightOff());
    }


    @Override
    public String stateName() {
        return "灯开了";
    }
}
