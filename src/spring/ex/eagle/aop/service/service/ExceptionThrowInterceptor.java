package spring.ex.eagle.aop.service.service;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionThrowInterceptor implements ThrowsAdvice {
	public void afterThrowing(Throwable e){
		System.out.println(e.getMessage());
	}
}
