package com.fdf.basecode.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fdf.basecode.dao.SampleDao;
import com.fdf.basecode.entity.SampleEntity;

@Repository
@Transactional
public class SampleDaoImpl implements SampleDao{

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SampleEntity create(SampleEntity e) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = null;

			tx = session.beginTransaction();
			SampleEntity newSampleEntity = new SampleEntity();
			newSampleEntity.setDesc(e.Desc);
			session.save(newSampleEntity);
			tx.commit();
			session.close();
	
			return newSampleEntity;
		} catch (Exception se) {
			System.out.print("FAIL");
			return e;
		}
	}

	public SampleEntity update(SampleEntity e) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = null;

			tx = session.beginTransaction();
			SampleEntity updateSampleEntity = (SampleEntity) session.get(SampleEntity.class, e.id);

			updateSampleEntity.setDesc(e.Desc);
			
			session.update(updateSampleEntity);
			tx.commit();
			session.close();

			return updateSampleEntity;
		} catch (Exception se) {
			return new SampleEntity();
		}
	}

	public boolean delete(int id) {
	    try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = null;	
			
	    	tx = session.beginTransaction();
	    	SampleEntity deleteSample = (SampleEntity)session.get(SampleEntity.class, id); 
	    	
	    	session.delete(deleteSample); 
	    	
	    	tx.commit();
	    	session.close();
	    	
	    	return true;
	    } catch (Exception e) {
	    	return false; 
	    }	
	}

	@SuppressWarnings("unchecked")
	public List<SampleEntity> ListSampleEntity() {
		Session session = this.sessionFactory.openSession();
		List<SampleEntity> list = session.createQuery("from SampleEntity").list();	
		session.close();
		return list;
	}

}
