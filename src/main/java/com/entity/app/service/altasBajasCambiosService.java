package com.entity.app.service;

import java.util.List;

import com.entity.app.dtos.ProductoRequestDTO;
import com.entity.app.entity.ProductoEntity;

public interface AltasBajasCambiosService {
	
	public void addProducto(ProductoRequestDTO productoRequestDTO);
	public void actualizarProducto(Long id, ProductoRequestDTO productoRequestDTO);
	public void eliminarProducto(Long id);
	public ProductoEntity buscarPorIDProducto(Long id);
	public List <ProductoEntity> listarTodos();

}
