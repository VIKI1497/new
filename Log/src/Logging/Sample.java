package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	static Logger name=Logger.getLogger(Sample.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		String Value=null;
		try {
			name.debug(Value.length());
		}catch(NullPointerException a) {
			name.info("error", a);
		    name.info("given input is null");
			}
	}

}
