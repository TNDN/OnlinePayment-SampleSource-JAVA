package paybox.payment.sample.model;

public class ErrorResult {
	private Result error;
	
	public Result getResult() {
		return error;
	}
    
	public void setResult(Result error) {
		this.error = error;
	}
}