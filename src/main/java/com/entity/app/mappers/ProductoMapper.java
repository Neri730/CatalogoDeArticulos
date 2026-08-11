package com.entity.app.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.entity.app.dtos.ProductoResponseDTO;
import com.entity.app.entity.ProductoEntity;

@Component
@Scope("singleton")
public class ProductoMapper {
	
	public ProductoResponseDTO mapperResponseDTO(ProductoEntity productoEntity) {
		ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();
		BeanUtils.copyProperties(productoEntity, productoResponseDTO);
		return productoResponseDTO;
	}

}
