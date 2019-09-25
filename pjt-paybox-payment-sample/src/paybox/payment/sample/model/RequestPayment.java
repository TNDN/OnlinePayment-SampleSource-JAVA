package paybox.payment.sample.model;

public class RequestPayment {
	private String partnerAPIId;
	private String partnerAPIKey;
	private int paymentType;
	private String pgCode;
	private String orderNo;
	private double transAmount;
	private String notiUrl;
	private String returnUrl;
	private String cancelUrl;
	private String orderInfo;
	private String email;
	private String additionalInfo;
	private Result error;
	
	public String getPartnerAPIId() {
		return partnerAPIId;
	}
	public void setPartnerAPIId(String partnerAPIId) {
		this.partnerAPIId = partnerAPIId;
	}
	public String getPartnerAPIKey() {
		return partnerAPIKey;
	}
	public void setPartnerAPIKey(String partnerAPIKey) {
		this.partnerAPIKey = partnerAPIKey;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public String getPgCode() {
		return pgCode;
	}
	public void setPgCode(String pgCode) {
		this.pgCode = pgCode;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public String getNotiUrl() {
		return notiUrl;
	}
	public void setNotiUrl(String notiUrl) {
		this.notiUrl = notiUrl;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getCancelUrl() {
		return cancelUrl;
	}
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
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
	public Result getResult() {
		return error;
	}
	public void setResult(Result error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "RequestPayment [partnerAPIId=" + partnerAPIId + ", partnerAPIKey=" + partnerAPIKey + ", paymentType="
				+ paymentType + ", pgCode=" + pgCode + ", orderNo=" + orderNo + ", transAmount=" + transAmount
				+ ", notiUrl=" + notiUrl + ", returnUrl=" + returnUrl + ", cancelUrl=" + cancelUrl + ", orderInfo="
				+ orderInfo + ", email=" + email + ", additionalInfo=" + additionalInfo + ", getPartnerAPIId()="
				+ getPartnerAPIId() + ", getPartnerAPIKey()=" + getPartnerAPIKey() + ", getPaymentType()="
				+ getPaymentType() + ", getPgCode()=" + getPgCode() + ", getOrderNo()=" + getOrderNo()
				+ ", getTransAmount()=" + getTransAmount() + ", getNotiUrl()=" + getNotiUrl() + ", getReturnUrl()="
				+ getReturnUrl() + ", getCancelUrl()=" + getCancelUrl() + ", getOrderInfo()=" + getOrderInfo()
				+ ", getEmail()=" + getEmail() + ", getAdditionalInfo()=" + getAdditionalInfo() + "]";
	}
}
