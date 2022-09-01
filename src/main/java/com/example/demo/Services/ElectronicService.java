package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ElectronicsStGtMeth;
import com.example.demo.Repository.CrudRepositoryInterface;

@Service
public class ElectronicService {
	
	@Autowired
	private CrudRepositoryInterface repo;
	
	public List<ElectronicsStGtMeth> allData(){
		List<ElectronicsStGtMeth> dataEl= new ArrayList<>();
		repo.findAll().forEach(dataEl::add);
		return dataEl;
	}
	
	public void saveData(ElectronicsStGtMeth oneData) {
		repo.save(oneData);
	}
}
