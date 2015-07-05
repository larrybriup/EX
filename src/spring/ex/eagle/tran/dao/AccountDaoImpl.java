package spring.ex.eagle.tran.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import spring.ex.eagle.tran.Account;

public class AccountDaoImpl extends HibernateTemplate implements AccountDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Account account) throws DataAccessException {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
			e.printStackTrace();
		}
		session.save(account);
	}

	public boolean update(Account account) throws DataAccessException {
		Session session = null;
		boolean flag = false;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
			e.printStackTrace();
		}
		try {
			session.saveOrUpdate(account);
			flag = true;
		} catch (HibernateException e) {
			throw new HibernateException(e.getMessage());
		}
		return flag;
	}

	public boolean delete(Account account) throws DataAccessException {
		Session session = null;
		boolean flag = false;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
			// e.printStackTrace();
		}
		try {
			session.delete(account);
			flag = true;
		} catch (HibernateException e) {
			throw new HibernateException(e.getMessage());
		}
		return flag;
	}

	public Account query(Account account){
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
		String hql="from Account a where a.name='"+account.getName()+"'";
		Query query = session.createQuery(hql);
		Object o = query.uniqueResult();
		if(o!=null){
			return (Account) o;
		}
		return null;
	}
}
