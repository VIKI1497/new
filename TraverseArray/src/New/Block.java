package New;

public class Block {
	static int a;
	static {
		a=100;
		System.out.println(a+10);
	}
	public static void main(String[] args) {
		//accessing a without object creation
		System.out.println(Block.a);
	}

}
