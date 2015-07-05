package spring.ex.eagle.tran.service;

import spring.ex.eagle.tran.Account;

public interface AccountService {
	void saveorupdate(Account account);
	void update(Account account);
	void remove(Account account);
}
