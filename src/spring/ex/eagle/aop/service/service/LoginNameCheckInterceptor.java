package spring.ex.eagle.aop.service.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoginNameCheckInterceptor implements MethodBeforeAdvice {

	public void before(Method m, Object[] args, Object target)
			throws Throwable {
		if(args!=null){
			if(args[0]==null||args[0]==""){
				throw new Exception("用户名不能为空!");
			}
			if(args[0].toString().trim().length()<2||
					args[0].toString().trim().length()>11){
				throw new Exception("用户名过短或者过长!");
			}
			if(args[1]==null||args[1]==""){
				throw new Exception("密码不能为空!");
			}
			if(args[1].toString().trim().length()<2||
					args[1].toString().trim().length()>11){
				throw new Exception("密码过短或者过长!");
			}
			System.out.println("check over!");
		}else{
			
			throw new Exception("用户名或密码不能为空!");
		}
		
	}
}
