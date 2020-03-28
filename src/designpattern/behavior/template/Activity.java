package designpattern.behavior.template;

/**
 * 模拟Android中的Activity
 *
 * @author xuexiang
 * @since 2020/3/28 10:52 PM
 */
public abstract class Activity {

    public Activity() {
        onCreate();
        start();
    }

    public void start() {
        onStart();
        onResume();
    }

    public void hidden() {
        onPause();
    }

    public void show() {
        onResume();
    }

    public void close() {
        hidden();
        onStop();
        onDestroy();
    }

    protected abstract void onCreate();

    protected abstract void onStart();

    protected abstract void onResume();

    protected abstract void onPause();

    protected abstract void onStop();

    protected abstract void onDestroy();


}
