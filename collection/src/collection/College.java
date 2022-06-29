package collection;

public class College {
	String collegeName;
	int collegeId;
	Address address;
	public College(String collegeName,int collegeId,Address address) {
		super.toString();
		this.collegeName=collegeName;
		this.collegeId=collegeId;
		this.address=address;
	}
	public String toString() {
		return collegeName+""+collegeId+""+address;
	}

}
