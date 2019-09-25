package paybox.payment.sample.model;

public class RequestDataResult {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestDataResult [data=" + data + "]";
	}
}
