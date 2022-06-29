package DAY1;

public class Prime {
	public static void main(String[] args) {
		int num = 5;
		boolean temp = true;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0)
				;
			temp = false;
		}
		if (temp == true) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
