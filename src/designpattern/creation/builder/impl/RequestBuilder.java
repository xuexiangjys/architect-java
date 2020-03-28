package designpattern.creation.builder.impl;

/**
 * 网络请求构建者
 *
 * @author xuexiang
 * @since 2020/3/28 3:52 PM
 */
public class RequestBuilder implements Builder {

	private String Url;
	private String Head;
	private String Mode;
	private String Body;
	private String Param;

	public RequestBuilder(String url) {
		Url = url;
	}

	@Override
	public RequestBuilder setUrl(String url) {
		Url = url;
		return this;
	}

	@Override
	public RequestBuilder setHead(String head) {
		Head = head;
		return this;
	}

	@Override
	public RequestBuilder setMode(String mode) {
		Mode = mode;
		return this;
	}

	@Override
	public RequestBuilder setBody(String body) {
		Body = body;
		return this;
	}

	@Override
	public RequestBuilder setParam(String param) {
		Param = param;
		return this;
	}

	public String getUrl() {
		return Url;
	}

	public String getHead() {
		return Head;
	}

	public String getMode() {
		return Mode;
	}

	public String getBody() {
		return Body;
	}

	public String getParam() {
		return Param;
	}

	@Override
	public RequestBody build() {
		return new HttpRequest(this);
	}
}
