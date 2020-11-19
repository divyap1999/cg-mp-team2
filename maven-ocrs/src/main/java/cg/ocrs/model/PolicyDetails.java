package cg.ocrs.model;

public class PolicyDetails {
	
	private int PolicyNo;
private int QuestionId;
	
	private String Answer;
public PolicyDetails(int policyNo, int questionId, String answer) {
		super();
		this.PolicyNo = policyNo;
		QuestionId = questionId;
		Answer = answer;
	}

		
	@Override
	public String toString() {
		return "PolicyDetails [policyNo=" + PolicyNo + ", QuestionId=" + QuestionId + ", Answer=" + Answer + "]";
	}

		
	public int getPolicyNo() {
		return PolicyNo;
	}


	public void setPolicyNo(int policyNo) {
		this.PolicyNo = policyNo;
	}


	public int getQuestionId() {
		return QuestionId;
	}


	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}


	public String getAnswer() {
		return Answer;
	}


	public void setAnswer(String answer) {
		Answer = answer;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		
		
	}

}
