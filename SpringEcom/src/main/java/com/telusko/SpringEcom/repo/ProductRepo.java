package com.telusko.SpringEcom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telusko.SpringEcom.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
