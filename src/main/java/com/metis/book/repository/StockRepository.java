package com.metis.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metis.book.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
