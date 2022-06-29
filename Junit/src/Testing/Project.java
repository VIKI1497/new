package Testing;

public class Project {
	public String name(String name1,String name2,String name3) {
		if(name1.length()>name2.length()&&name1.length()>name3.length()) {
			return name1.toUpperCase();
		}
		else if(name2.length()>name1.length()&&name2.length()>name3.length()) {
			return name2.toUpperCase();
		}
		else{
			return name3.toUpperCase();
		}
	}
}