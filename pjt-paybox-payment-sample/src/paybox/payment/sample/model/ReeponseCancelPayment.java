package paybox.payment.sample.model;

public class ReeponseCancelPayment {
	private CancelPayment data;

	public CancelPayment getData() {
		return data;
	}

	public void setData(CancelPayment data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReeponseCancelPayment [data=" + data + ", getData()=" + getData() + "]";
	}
}
