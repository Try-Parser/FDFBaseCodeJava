package com.fdf.basecode.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fdf.basecode.entity.SampleEntity;
import com.fdf.basecode.service.SampleService;

@Controller
@RequestMapping("api/sample")
public class SampleApi {
	
	@Autowired
	private SampleService sampleService;	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SampleEntity> listCustomer() {
		List<SampleEntity> list = null;
		list = sampleService.ListSampleEntity();
		return list;
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public ResponseEntity<SampleEntity> newEntity(@RequestBody SampleEntity e){
		try {
			SampleEntity newSampleEntity = sampleService.create(e);
			return new ResponseEntity<SampleEntity>(newSampleEntity, HttpStatus.OK);		
		} catch(Exception se) {
			return new ResponseEntity<SampleEntity>(e, HttpStatus.BAD_REQUEST);
		}		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<SampleEntity> updateEntity(@RequestBody SampleEntity e) {
		try {
			SampleEntity updateSampleEntity = sampleService.update(e);
			return new ResponseEntity<SampleEntity>(updateSampleEntity, HttpStatus.OK);		
		} catch(Exception se) {
			return new ResponseEntity<SampleEntity>(e, HttpStatus.BAD_REQUEST);
		}		
	}	
	/**
	 * Delete customer
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteSampleEntity(@PathVariable("id") int id) {
		try {
			boolean deleteReturn = sampleService.delete(id);
			if (deleteReturn==true) {
				return new ResponseEntity<String>(HttpStatus.OK);
			} else {
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			}
		}catch(Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}	

}
