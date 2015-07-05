package spring.ex.eagle.aop.service.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoginCountInterceptor implements AfterReturningAdvice {
private  int i=1;
	public void afterReturning(Object returnValue, Method m, Object[] args,
			Object target) throws Throwable {
		System.out.println("这是"+args[0]+"第"+i+"次登陆.");
		i++;
	}
}
