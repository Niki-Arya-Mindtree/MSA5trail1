package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ElectronicsStGtMeth;
import com.example.demo.Services.ElectronicService;

@RestController
public class ElectronicController {
	
	@Autowired
	private ElectronicService serv;
	
	@GetMapping("/user")
	public List<ElectronicsStGtMeth> getAllData(){
		return serv.allData();
	}
	
	@PostMapping("/user")
	public void getSaveData(@RequestBody ElectronicsStGtMeth oneData) {
		serv.saveData(oneData);
	}
}
