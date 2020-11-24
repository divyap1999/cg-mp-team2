package cg.ocrs.model;

public class Questions {

	private int claimTypeId;
	private int quesId;
	private String claimType;
	private String Question;
	private int answerId;
	private String answer;
	
	
	public Questions() {
		
	}
	
	public Questions(int claimTypeId, int quesId, String claimType, String question, int answerId, String answer) {
		super();
		this.claimTypeId = claimTypeId;
		this.quesId = quesId;
		this.claimType = claimType;
		Question = question;
		this.answerId = answerId;
		this.answer = answer;
	}



	public int getClaimTypeId() {
		return claimTypeId;
	}
	public void setClaimTypeId(int claimTypeId) {
		this.claimTypeId = claimTypeId;
	}
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Question == null) ? 0 : Question.hashCode());
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + answerId;
		result = prime * result + ((claimType == null) ? 0 : claimType.hashCode());
		result = prime * result + claimTypeId;
		result = prime * result + quesId;
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
		Questions other = (Questions) obj;
		if (Question == null) {
			if (other.Question != null)
				return false;
		} else if (!Question.equals(other.Question))
			return false;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (answerId != other.answerId)
			return false;
		if (claimType == null) {
			if (other.claimType != null)
				return false;
		} else if (!claimType.equals(other.claimType))
			return false;
		if (claimTypeId != other.claimTypeId)
			return false;
		if (quesId != other.quesId)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Questions [claimTypeId=" + claimTypeId + ", quesId=" + quesId + ", claimType=" + claimType
				+ ", Question=" + Question + ", answerId=" + answerId + ", answer=" + answer + "]";
	}
	
	
	
	
	
}
