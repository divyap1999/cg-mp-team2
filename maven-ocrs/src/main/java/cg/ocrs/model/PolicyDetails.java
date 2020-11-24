package cg.ocrs.model;

public class PolicyDetails {
	
	private int policyNo;
    private String questionId;
	private String answer;
	public PolicyDetails(int policyNo, String questionId, String answer) {
		super();
		this.policyNo = policyNo;
		this.questionId = questionId;
		this.answer = answer;
	}
	public PolicyDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "PolicyDetails [policyNo=" + policyNo + ", questionId=" + questionId + ", answer=" + answer + "]";
	}









	
	
	



		
		
	}


