package cg.ocrs.model;

public class Policy {

	private long policyNumber;
	private float policyPremium;
	public int accountNumber;
	
	
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long l) {
		this.policyNumber = l;
	}
	public float getPolicyPremium() {
		return policyPremium;
	}
	public void setPolicyPremium(float policyPremium) {
		this.policyPremium = policyPremium;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Policy() {
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyNumber, float policyPremium, int accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyPremium=" + policyPremium + ", accountNumber="
				+ accountNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + (int) (policyNumber ^ (policyNumber >>> 32));
		result = prime * result + Float.floatToIntBits(policyPremium);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (policyNumber != other.policyNumber)
			return false;
		if (Float.floatToIntBits(policyPremium) != Float.floatToIntBits(other.policyPremium))
			return false;
		return true;
	}
	
	

}
