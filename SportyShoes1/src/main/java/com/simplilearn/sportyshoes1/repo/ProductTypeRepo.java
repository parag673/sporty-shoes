package com.simplilearn.sportyshoes1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.sportyshoes1.entity.ProductType;

public interface ProductTypeRepo extends JpaRepository<ProductType, Integer> {
	
	@Query("select p.prodType from ProductType p where p.orderId=:orderId")
	public String findByOrderId(int orderId);

}
