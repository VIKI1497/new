package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Number {
	static Logger num=Logger.getLogger(Number.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int number1=10;
		int number2=20;
		num.info("Addition of two numbers");
		num.debug(number1+number2);
	}

}
