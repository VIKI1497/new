package collection;

public class Student {
	private String name;
	private int id;
	private boolean isMale;
	private int age;
	private int fees;
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setisMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getisMale() {
		return isMale;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setfees(int fees) {
		this.fees=fees;
	}
	public int getfees() {
		return fees;
	}
	public Student(String name,int id,boolean isMale,int age,int fees) {
		this.name=name;
		this.id=id;
		this.isMale=isMale;
		this.age=age;
		this.fees=fees;
	}
	public String toString() {
		return name+""+id+""+isMale+""+age+""+fees;
	}

}
