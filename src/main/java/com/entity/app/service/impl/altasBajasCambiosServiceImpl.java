package com.entity.app.service.impl;

import java.util.List;

import com.entity.app.entity.ProductoEntity;
import com.entity.app.repository.ProductoRepository;
import com.entity.app.service.altasBajasCambiosService;

public class altasBajasCambiosServiceImpl implements altasBajasCambiosService {

	private final ProductoRepository productoRepository;
	
	public altasBajasCambiosServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public void añadirProducto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPorIDProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductoEntity> listarTodos() {
		return productoRepository.findAll();
	}
	
	

}
