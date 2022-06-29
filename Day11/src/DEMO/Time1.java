package DEMO;

public class Time1 {
	public static void main(String[] args) {
		int a=22;
		for(int i=0;i<24;i++) {
			if(a==i) {
			}
		}
		if(a>=0&&a<12) {
			System.out.println("Am");
		}
		else if(a>=12&&a<24) {
			System.out.println("Pm");
		}
	}

}
