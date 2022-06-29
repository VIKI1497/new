package exception;

public class Gmail {
	public static void main(String[] args) {
		String id="ramkumargmail";
		try {
		if(!id.contains("@")) {
			throw new MailException("not valid gmail");
		}
		else {
			System.out.println("valid gmail");
		}
		}catch(MailException m) {
			m.printStackTrace();
			System.out.println("kindly use @ symbol at end of your name created!!");
		}
		
	}

}
