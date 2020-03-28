package designpattern.creation.builder;

import designpattern.creation.builder.impl.RequestBuilder;

/**
 * 建造者模式： 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * <p>
 * 建造者模式注重零部件的组装过程【具体的创建在产品内部创建】
 * <p>
 * 详情参见：https://blog.csdn.net/xuexiangjys/article/details/78924434
 *
 * @author xuexiang
 * @since 2020/3/28 3:54 PM
 */
public class BuilderTest {

    public static void main(String[] args) {
        String result = new RequestBuilder("http://192.168.1.23")
                .setParam("param123")
                .setHead("head123")
                .setMode("post")
                .setBody("请求结果")
                .build()
                .request();

        System.out.print(result);
    }
}
