package pl.bal.konrad;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void logExecution(){
		logger.info("Method logExecution() ");
	}
	
	public void warnIfNull(Object returnedValue){
		if(returnedValue == null)
			logger.warn("Zwracana wartosc jest nullem");
	}
	
	public void serveException(RuntimeException ex){
		logger.error("Exception: " +ex.getMessage());
	}
	
	public void methodExecuted(JoinPoint joinPoint){
		logger.info("Method " +joinPoint.getSignature().getName() + " has already executed");
	}

}
