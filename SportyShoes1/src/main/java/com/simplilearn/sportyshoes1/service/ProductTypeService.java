package com.simplilearn.sportyshoes1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sportyshoes1.entity.ProductType;
import com.simplilearn.sportyshoes1.repo.ProductTypeRepo;

@Service
public class ProductTypeService {
	
	@Autowired
	ProductTypeRepo repo;
	
	public ProductType saveType(ProductType type) {
		return repo.save(type);
	}
	
	public String findByOrderId (int orderId) {
		return repo.findByOrderId(orderId);
	}
	

}
