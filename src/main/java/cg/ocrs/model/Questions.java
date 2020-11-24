package cg.ocrs.model;

public class Questions {

	private int claimTypeId;
	private int quesId;
	private String claimType;
	private String Question;
	private int answerId;
	private String answer1;
	private int a1weightage;
	private String answer2;
	private int a2weightage;
	private String answer3;
	private int a3weightage;
	public int getClaimTypeId() {
		return claimTypeId;
	}
	

	public Questions(int claimTypeId, int quesId, String claimType, String question, int answerId, String answer1,
			int a1weightage, String answer2, int a2weightage, String answer3, int a3weightage) {
		super();
		this.claimTypeId = claimTypeId;
		this.quesId = quesId;
		this.claimType = claimType;
		Question = question;
		this.answerId = answerId;
		this.answer1 = answer1;
		this.a1weightage = a1weightage;
		this.answer2 = answer2;
		this.a2weightage = a2weightage;
		this.answer3 = answer3;
		this.a3weightage = a3weightage;
	}





	public Questions() {
		// TODO Auto-generated constructor stub
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
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public int getA1weightage() {
		return a1weightage;
	}
	public void setA1weightage(int a1weightage) {
		this.a1weightage = a1weightage;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public int getA2weightage() {
		return a2weightage;
	}
	public void setA2weightage(int a2weightage) {
		this.a2weightage = a2weightage;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public int getA3weightage() {
		return a3weightage;
	}
	public void setA3weightage(int a3weightage) {
		this.a3weightage = a3weightage;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Question == null) ? 0 : Question.hashCode());
		result = prime * result + a1weightage;
		result = prime * result + a2weightage;
		result = prime * result + a3weightage;
		result = prime * result + ((answer1 == null) ? 0 : answer1.hashCode());
		result = prime * result + ((answer2 == null) ? 0 : answer2.hashCode());
		result = prime * result + ((answer3 == null) ? 0 : answer3.hashCode());
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
		if (a1weightage != other.a1weightage)
			return false;
		if (a2weightage != other.a2weightage)
			return false;
		if (a3weightage != other.a3weightage)
			return false;
		if (answer1 == null) {
			if (other.answer1 != null)
				return false;
		} else if (!answer1.equals(other.answer1))
			return false;
		if (answer2 == null) {
			if (other.answer2 != null)
				return false;
		} else if (!answer2.equals(other.answer2))
			return false;
		if (answer3 == null) {
			if (other.answer3 != null)
				return false;
		} else if (!answer3.equals(other.answer3))
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
				+ ", Question=" + Question + ", answerId=" + answerId + ", answer1=" + answer1 + ", a1weightage="
				+ a1weightage + ", answer2=" + answer2 + ", a2weightage=" + a2weightage + ", answer3=" + answer3
				+ ", a3weightage=" + a3weightage + "]";
	}

	
	
	

}
	
	