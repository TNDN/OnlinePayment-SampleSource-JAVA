package paybox.payment.sample.model;

public class CancelPayment {
	private String resultCode;
	private String resultMessage;
	private String resultNMessage;
	private String transactionId;
	private String cancelDataTime;
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultNMessage() {
		return resultNMessage;
	}
	public void setResultNMessage(String resultNMessage) {
		this.resultNMessage = resultNMessage;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getCancelDataTime() {
		return cancelDataTime;
	}
	public void setCancelDataTime(String cancelDataTime) {
		this.cancelDataTime = cancelDataTime;
	}
	
	@Override
	public String toString() {
		return "CancelPayment [resultCode=" + resultCode + ", resultMessage=" + resultMessage + ", resultNMessage="
				+ resultNMessage + ", transactionId=" + transactionId + ", cancelDataTime=" + cancelDataTime
				+ ", getResultCode()=" + getResultCode() + ", getResultMessage()=" + getResultMessage()
				+ ", getResultNMessage()=" + getResultNMessage() + ", getTransactionId()=" + getTransactionId()
				+ ", getCancelDataTime()=" + getCancelDataTime() + "]";
	}
}
