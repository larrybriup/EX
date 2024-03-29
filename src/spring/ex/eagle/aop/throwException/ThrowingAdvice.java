package spring.ex.eagle.aop.throwException;

import org.springframework.aop.ThrowsAdvice;

import spring.ex.eagle.aop.aspect.MyLogger;

public class ThrowingAdvice implements 
ThrowsAdvice{
	private MyLogger logger;

	public MyLogger getLogger() {
		return logger;
	}

	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}
	
	//这里这个方法的名字一定要叫afterThrowing
	public void afterThrowing(Throwable e){
		logger.log(e.getMessage());
	}
	
}
