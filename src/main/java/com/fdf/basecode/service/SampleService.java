package com.fdf.basecode.service;

import java.util.List;

import com.fdf.basecode.entity.SampleEntity;

public interface SampleService {
	public SampleEntity create(SampleEntity e);
	public SampleEntity update(SampleEntity e);
	public boolean delete(int id);
	public List<SampleEntity> ListSampleEntity();
}
