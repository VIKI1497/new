package Functioncall;

public class Ex {
	public String findMin(int a,int b) {
		if(a<b) {
			return a+" is minimum";
		}
		else {
			return b+" is minimum";
		}
	}
	public static void main(String[]args) {
		Ex e=new Ex();
		System.out.println(e.findMin(2, 4));
	}

}
