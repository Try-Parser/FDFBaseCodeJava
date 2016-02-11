package com.fdf.basecode.dao;

import java.util.List;

import com.fdf.basecode.entity.SampleEntity;

public interface SampleDao {
	public SampleEntity create(SampleEntity e);
	public SampleEntity update(SampleEntity e);
	public boolean delete(int id);
	public List<SampleEntity> ListSampleEntity();
}
