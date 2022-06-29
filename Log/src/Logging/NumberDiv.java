package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class NumberDiv {
	static Logger divide=Logger.getLogger(NumberDiv.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int number1=10;
		int number2=0;
		try {
			divide.debug("division="+number1/number2);
			
		}catch(ArithmeticException a) {
			a.printStackTrace();
			divide.error("Arithmetic Exception");
			
		}
		divide.info("Any number divide by zero not applicable");
	}

}
