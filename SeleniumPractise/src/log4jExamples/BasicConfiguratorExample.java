package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	static Logger logger = Logger.getLogger(BasicConfigurator.class); //Factory design pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		logger.fatal("This is a fatal message");
	}
}