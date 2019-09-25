package paybox.payment.sample.model;

public class PartnerNotification {
	private String transactionId;
	private String transactionDateTime;
	private String transactionCurrency;
	private String transactionPGCode;
	private String orderNo;
	private String orderInfo;
	private double transAmount;
	private String email;
	private String additionalInfo;
	private String exchangeCurrecy;
	private double exchangeRate;
	private double exchangeAmount;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	public String getTransactionCurrency() {
		return transactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}
	public String getTransactionPGCode() {
		return transactionPGCode;
	}
	public void setTransactionPGCode(String transactionPGCode) {
		this.transactionPGCode = transactionPGCode;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public String getExchangeCurrecy() {
		return exchangeCurrecy;
	}
	public void setExchangeCurrecy(String exchangeCurrecy) {
		this.exchangeCurrecy = exchangeCurrecy;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public double getExchangeAmount() {
		return exchangeAmount;
	}
	public void setExchangeAmount(double exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}
	
	@Override
	public String toString() {
		return "PartnerNotification [transactionId=" + transactionId + ", transactionDateTime=" + transactionDateTime
				+ ", transactionCurrency=" + transactionCurrency + ", transactionPGCode=" + transactionPGCode
				+ ", orderNo=" + orderNo + ", orderInfo=" + orderInfo + ", transAmount=" + transAmount + ", email="
				+ email + ", additionalInfo=" + additionalInfo + ", exchangeCurrecy=" + exchangeCurrecy
				+ ", exchangeRate=" + exchangeRate + ", exchangeAmount=" + exchangeAmount + "]";
	}
}
