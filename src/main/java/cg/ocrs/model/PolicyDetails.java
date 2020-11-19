package cg.ocrs.model;

public class PolicyDetails {
private int PolicyNumber;
private String QuestionId;
private String Answer;


public PolicyDetails(int policyNumber, String questionId, String answer) {
	super();
	this.PolicyNumber = policyNumber;
	this.QuestionId = questionId;
	this.Answer = answer;
}

public int getPolicyNumber() {
	return PolicyNumber;
}

public void setPolicyNumber(int policyNumber) {
	PolicyNumber = policyNumber;
}

public String getQuestionId() {
	return QuestionId;
}

public void setQuestionId(String questionId) {
	QuestionId = questionId;
}

public String getAnswer() {
	return Answer;
}

public void setAnswer(String answer) {
	Answer = answer;
}

@Override
public String toString() {
	return "PolicyDetails [PolicyNumber=" + PolicyNumber + ", QuestionId=" + QuestionId + ", Answer=" + Answer + "]";
}

}
