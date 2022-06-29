package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class NumberSub {
	static Logger number=Logger.getLogger(NumberSub.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int number1=10;
		int number2=5;
		number.info("Subraction of two numbers");
		number.debug(number1-number2);
	}

}
