package designpattern.behavior.state;

/**
 * 灯
 *
 * @author xuexiang
 * @since 2020/3/29 12:16 AM
 */
public class Light {

    private LightState mLightState;

    public LightState getLightState() {
        return mLightState;
    }

    public void setLightState(LightState lightState) {
        mLightState = lightState;
    }

    public Light(LightState state) {
        mLightState = state;
    }

    public void PressSwitch() {
        mLightState.pressSwitch(this);
    }

}
