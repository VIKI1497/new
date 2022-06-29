package Oops;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen("cello",10,"blue");
		Pen p2=new Pen("reynold",15,"red");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getcostly(p2));
	}
}
