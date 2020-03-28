package designpattern.structure.adapter;

/**
 * 需要适配的对象
 *
 * @author xuexiang
 * @since 2020/3/28 5:33 PM
 */
public class Target {

    public void oldMethod() {
        System.out.println("this is original method!");
    }
}
