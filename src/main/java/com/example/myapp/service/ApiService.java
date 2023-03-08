package com.example.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myapp.model.ApiModel;
import com.example.myapp.repository.ApiRepository;



@Service
public class ApiService {
	@Autowired
	ApiRepository stRepo;
	
	public ApiModel saveDetails(ApiModel st)
	{
		return stRepo.save(st);
	}
	
	public List<ApiModel> getDetails(){
		return stRepo.findAll();
	}
	
	public ApiModel updateDetails(ApiModel e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails(int Id)
	{
		stRepo.deleteById(Id);
	}
	
	public List<ApiModel> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<ApiModel> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<ApiModel> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}


	
}