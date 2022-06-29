package DEMO;

public class R3 { 
	public static void main(String[] args) {
		int a=10;
		for(int i=1;i<=a;i++) {
			if(i%2==0||i%3==0||i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
