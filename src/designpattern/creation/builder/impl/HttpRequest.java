package designpattern.creation.builder.impl;

/**
 * 模拟网络请求
 *
 * @author xuexiang
 * @since 2020/3/28 3:53 PM
 */
public class HttpRequest implements RequestBody {

    private String url;
    private String head;
    private String mode;
    private String body;
    private String param;

    public HttpRequest(RequestBuilder builder) {
        url = builder.getUrl();
        head = builder.getHead();
        mode = builder.getMode();
        body = builder.getBody();
        param = builder.getParam();
    }

    @Override
    public String request() {
        return "执行请求操作,  url:" + url + ", head:" + head + ", mode:" + mode + ", body:" + body + ", param:" + param;
    }
}
