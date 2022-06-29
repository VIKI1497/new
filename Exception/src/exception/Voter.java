package exception;

public class Voter {
	public static void main(String[] args) throws AgeException {
		int age=15;
		try {
		if(age<18) {
			throw new AgeException("age is unapplicable");
		}
		else {
			System.out.println("eligble");
		}
		}catch(AgeException a) {
			a.printStackTrace();
		}
		System.out.println("Hello voter is eligible after completion of 18 years");
		
	}

}
