package Oops;

public class UsePhone {
	public static void main(String[] args) {
		Ram r=new Ram("intel",16);
		Phone p=new Phone("samsung",25000,"M-series",r);
		System.out.println(p);
	}

}
