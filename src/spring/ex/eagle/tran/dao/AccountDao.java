package spring.ex.eagle.tran.dao;

import spring.ex.eagle.tran.Account;
import org.springframework.dao.DataAccessException;

public interface AccountDao {
	void save(Account account) throws DataAccessException;

	boolean update(Account account) throws DataAccessException;

	boolean delete(Account account) throws DataAccessException;
}
