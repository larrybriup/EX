package spring.ex.eagle.aop.dao;

import org.springframework.stereotype.Component;

import spring.ex.eagle.aop.pojo.Account;

@Component("accountDao")
public class AccountDaoImpl implements AccountDao{
	
	public void withdraw(Account acc, double amt) {
		System.out.println("this is withdraw!");
	}

	public void deposit(Account acc, double amt) {
		System.out.println("this is deposit!");
	}
}
