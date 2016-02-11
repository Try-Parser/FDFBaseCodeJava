package com.fdf.basecode.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdf.basecode.dao.SampleDao;
import com.fdf.basecode.entity.SampleEntity;
import com.fdf.basecode.service.SampleService;

@Service
@Transactional
public class SampleServiceImpl implements SampleService{

	@Autowired
    private SampleDao sampleDao;
	
	public SampleEntity create(SampleEntity e) {
		// TODO Auto-generated method stub
		return sampleDao.create(e);
	}

	public SampleEntity update(SampleEntity e) {
		// TODO Auto-generated method stub
		return sampleDao.update(e);
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return sampleDao.delete(id);
	}

	public List<SampleEntity> ListSampleEntity() {
		// TODO Auto-generated method stub
		return sampleDao.ListSampleEntity();
	}

}
