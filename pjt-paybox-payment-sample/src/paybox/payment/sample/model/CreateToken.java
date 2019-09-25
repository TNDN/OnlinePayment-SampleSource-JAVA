package paybox.payment.sample.model;

public class CreateToken {
	private String partnerAPIId;
	private String partnerAPIKey;
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
	public Result getResult() {
		return error;
	}
	public void setResult(Result error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "CreateToken [partnerAPIId=" + partnerAPIId + ", partnerAPIKey=" + partnerAPIKey + "]";
	}
}
