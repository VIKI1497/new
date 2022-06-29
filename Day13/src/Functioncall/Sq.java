package Functioncall;

public class Sq {
	public String square(int a) {
		int sq=(int) Math.sqrt(a);
		if(sq*sq==a) {
		return "Given number is square";
		}
		else {
			return "Given number is not square";
		}
	}
	public static void main(String[]args) {
		Sq s=new Sq();
		System.out.println(s.square(20));
		
	}

}
