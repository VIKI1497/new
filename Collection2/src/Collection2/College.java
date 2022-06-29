package Collection2;

public class College {
	private String name;
	private String grade;
	private int fees;
	private int collegeCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
		
	}
	public College(String name, String grade, int fees, int collegeCode) {
		super();
		this.name = name;
		this.grade = grade;
		this.fees = fees;
		this.collegeCode = collegeCode;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", fees=" + fees + ", collegeCode=" + collegeCode + "]";
	}
	

}
