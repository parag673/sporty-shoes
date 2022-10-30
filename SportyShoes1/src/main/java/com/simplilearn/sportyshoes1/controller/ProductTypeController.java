package com.simplilearn.sportyshoes1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes1.entity.ProductType;
import com.simplilearn.sportyshoes1.service.ProductTypeService;

@RestController
@RequestMapping("/type")
public class ProductTypeController {

	
	@Autowired
	ProductTypeService service;
	
	@PostMapping("/")
	public ResponseEntity<Object> saveType(@RequestBody ProductType type){
		ProductType entity= service.saveType(type);
		
		if(entity!=null)
			return new ResponseEntity<Object>(entity, HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting type",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity<String> findType(@PathVariable int orderId){
		String resp= service.findByOrderId(orderId);
		if(resp!=null)
			return new ResponseEntity<String>(resp,HttpStatus.FOUND);
		else
			return new ResponseEntity<String>("Type not avaibale",HttpStatus.NOT_FOUND);
	}
}
