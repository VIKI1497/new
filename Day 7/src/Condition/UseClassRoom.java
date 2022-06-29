package Condition;

public class UseClassRoom {
	public static void main(String[]args) {
		ClassRoom c1=new ClassRoom();
		c1.stutot=38;
		c1.section="Bristol";
		
		ClassRoom c2=new ClassRoom();
		c2.stutot=32;
		c2.section="Gothenbug";
		
		if (c1.stutot>c2.stutot) {
			System.out.println("Section:"+c1.section);	
		}
		else {
			System.out.println("Section:"+c2.section);
		}
		if (c2.section.startsWith("G")&&c2.section.endsWith("g")) {
			System.out.println("Student Total="+c2.stutot+","+"Section="+c2.section); 				
			}
		else {
			System.out.print("*****");
			
			
		}
			
	}

}
