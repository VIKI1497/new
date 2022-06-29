package New;

public class Employee {
	String name;
	int id;
	static String companyName="TATA";
	Employee(String name1,int id1){
		name=name1;
		id=id1;
	}
	void display(){
		System.out.println(name+" "+id+" "+companyName);
	}
	public static void main(String[] args) {
		Employee e=new Employee("ram",325);
		e.display();
	}

}
