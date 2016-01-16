package pl.bal.konrad;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void logExecution(JoinPoint joinPoint){
		logger.info(joinPoint.getSignature());
	}
	
	public void logWithStringExecution(String arg) {
		System.out.println("Argument: " +arg);
	}
	
	

}
