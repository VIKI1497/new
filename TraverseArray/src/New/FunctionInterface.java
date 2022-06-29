package New;
interface sample{
	void display();
}

public class FunctionInterface  {
	public static void main(String[] args) {
		sample look=()->System.out.println("This is functional Interface");
		look.display();
	}

}
