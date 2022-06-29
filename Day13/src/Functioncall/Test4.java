package Functioncall;

public class Test4 {
	public void city(String a) {
		switch (a) {
		case "Usa":
			System.out.println("washington");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		case "China":
			System.out.println("Beiling");
			break;
		case "SouthKorea":
			System.out.println("Soeue");
			break;
		case "India":
			System.out.println("Delhi");
			break;
		case "Uk":
			System.out.println("london");
			break;
			default :
				System.out.println("NOT VALID");
			}
	}
	public static void main(String[]args) {
		Test4 t=new Test4();
		String a="India";
		t.city(a);
		
	}

}
