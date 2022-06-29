package collection;

public class Programmer {
	private String name;
	private int id;
	private String gender;
	private String designation;
	private String codingLanguage;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setCodingLanguage(String codingLanguage) {
		this.codingLanguage=codingLanguage;
	}
	public String getCodingLanguage() {
		return codingLanguage;
	}
	public Programmer(String name,int id,String gender,String designation,String codingLanguage) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.designation=designation;
		this.codingLanguage=codingLanguage;
	}
	public String toString() {
		return name+""+id+""+gender+""+designation+""+codingLanguage;
	}
}
