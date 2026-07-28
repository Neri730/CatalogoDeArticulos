package com.entity.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.app.entity.ProductoEntity;

@RepositoryRestResource
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
	
}
