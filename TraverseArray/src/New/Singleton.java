package New;

public class Singleton {
	public static Singleton single_instance=null;
	String s;
	//Constructor will be private to create singleton class 
	private Singleton() {
		s="Singleton class";
	}
	// static method
	//to create instance of singleton class
	public static Singleton getInstance() {
		if(single_instance==null) {
			single_instance=new Singleton();
	}
	return single_instance;
	}
}
	
