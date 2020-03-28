package designpattern.structure.facade;

/**
 * 外观模式:为子系统中的一组接口提供一个一致的界面，定义一个高层接口，这个接口使得这一子系统更加容易使用。
 * <p>
 * 解决相关联类与类之间的依赖关系，将他们的依赖关系放到一个外观类中，可降低系统的复杂度
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 9:05 PM
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("=============");
        computer.shutdown();
    }
}
