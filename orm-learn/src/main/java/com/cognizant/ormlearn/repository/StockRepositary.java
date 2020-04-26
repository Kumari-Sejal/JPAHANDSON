package com.cognizant.ormlearn.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepositary extends JpaRepository<Stock, Integer>{
	
	List<Stock> findByCodeAndDateBetween(String code, Date date1, Date date2); 
	List<Stock> findTop3ByCodeOrderByCloseAsc(String code); 
	List<Stock> findTop3ByCodeOrderByVolumeDesc(String code);
}
