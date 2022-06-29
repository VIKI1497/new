package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogExample {
	static Logger log=Logger.getLogger(LogExample.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("good morning");
		log.error("helloworld");
		log.debug("how are you");
		log.fatal("thank you!!");
		log.warn("<-warning->");
	}

}
