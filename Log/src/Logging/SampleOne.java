package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SampleOne {
	static Logger sample=Logger.getLogger(SampleOne.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int[] numbers= {10,20,30,40,60};
		try {
			sample.info(numbers[5]+10);
		}catch(ArrayIndexOutOfBoundsException a) {
			sample.info("value is null", a);
		}
	}

}
