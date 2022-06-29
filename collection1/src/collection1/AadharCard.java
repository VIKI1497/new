package collection1;

public class AadharCard {
	private long aadharCardNo;
	private String name;
	private int age;
	private String gender;
	private String fatherName;
	public void setAadharCardNo(long aadharCardNo) {
		this.aadharCardNo=aadharCardNo;
	}
	public long getAadharCardNo() {
		return aadharCardNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setFatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public AadharCard(long aadharCardNo,String name,int age,String gender,String fatherName) {
		this.aadharCardNo=aadharCardNo;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.fatherName=fatherName;
	}
	public String toString() {
		return aadharCardNo+""+name+""+age+""+gender+""+fatherName;
	}
}
