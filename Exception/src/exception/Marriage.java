package exception;

public class Marriage {
	public static void main(String[] args) throws AgeException {
	int groomAge=24;
	int brideAge=17;
	try {
		if(groomAge<22) {
			throw new AgeException ("groom age is not eligible");
		}
		else if(brideAge<18) {
			throw new AgeException("bride age is not eligible");
		}
		else {
			System.out.println("both are eligible for marriage");
		}
	}catch(AgeException a) {
		a.printStackTrace();
		System.out.println("As per govenment rule bride age must be greater than 20 and groom age must be greater than 22");
	}
	}

}
