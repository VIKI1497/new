package Collection2;
import java.util.ArrayList;

public class ApplicationDeveloper {
	public static void main(String[] args) {
		ArrayList<String> developerName=new ArrayList<> ();
		developerName.add("prakaash");
		developerName.add("manimaran");
		developerName.add("virat");
		developerName.stream().map(x->x.toUpperCase()).forEach(y-> System.out.println(y)); //map method
		developerName.stream().filter(p->p.contains("i")).forEach(q->System.out.println(q)); //Filter method
	}
	
	} 


