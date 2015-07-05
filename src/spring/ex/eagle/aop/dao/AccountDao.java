package spring.ex.eagle.aop.dao;

import spring.ex.eagle.aop.pojo.Account;

public interface AccountDao {
	void withdraw(Account acc,double amt);
	void deposit(Account acc,double amt);
}
