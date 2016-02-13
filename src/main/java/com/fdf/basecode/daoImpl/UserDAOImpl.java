package com.fdf.basecode.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fdf.basecode.dao.UserDAO;
import com.fdf.basecode.entity.UserCred;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
     
    @Autowired
    private SessionFactory sessionFactory;
     
 
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public UserCred getUser(String login) {
		List<UserCred> userList = new ArrayList<UserCred>();
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from UserCred where login = :login");
		query.setParameter("login", login);
		userList = query.list();
		if (userList.size() > 0){
			return userList.get(0);
		}else
		{
			return new UserCred();
		}
	}

}
