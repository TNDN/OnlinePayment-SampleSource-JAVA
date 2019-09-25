package paybox.payment.sample.model;

public class RequestCancelPayment {
	private int cancelType;
	private String transactionId;
	private double transAmount;
	private Result error;
	
	public int getCancelType() {
		return cancelType;
	}
	public void setCancelType(int cancelType) {
		this.cancelType = cancelType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public Result getResult() {
		return error;
	}
	public void setResult(Result error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "RequestCancelPayment [cancelType=" + cancelType + ", transactionId=" + transactionId + ", transAmount="
				+ transAmount + "]";
	}
}
