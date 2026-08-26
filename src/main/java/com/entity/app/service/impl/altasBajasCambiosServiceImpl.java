package com.entity.app.service.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.entity.app.dtos.ProductoRequestDTO;
import com.entity.app.entity.ProductoEntity;
import com.entity.app.mappers.ProductoMapper;
import com.entity.app.repository.ProductoRepository;
import com.entity.app.service.AltasBajasCambiosService;

@Service
public class AltasBajasCambiosServiceImpl implements AltasBajasCambiosService {
	
	private final AtomicLong idGenerator = new AtomicLong(1);
	private final ProductoMapper productoMapper;
	private final ProductoRepository productoRepository;
	
	public AltasBajasCambiosServiceImpl(ProductoRepository productoRepository, ProductoMapper productoMapper) {
		this.productoMapper = productoMapper;
		this.productoRepository = productoRepository;
	}

	@Override
	public void addProducto(ProductoRequestDTO productoRequestDTO) {
		Long nuevoId = idGenerator.getAndIncrement();
		ProductoEntity productoEntity = ProductoEntity.builder()
				//.id(nuevoId)
				.identificadorNegocio(productoRequestDTO.getIdentificadorNegocio())
				.claveProducto(productoRequestDTO.getClaveProducto())
				.nombre(productoRequestDTO.getNombre())
				.precio(productoRequestDTO.getPrecio())
				.activo(productoRequestDTO.getActivo())
				.fechaRegistro(productoRequestDTO.getFechaRegistro())
				.usuarioAuditor(productoRequestDTO.getUsuarioAuditor())
				.build();
		productoRepository.save(productoEntity);
	}

	@Override
	public void actualizarProducto(Long id, ProductoRequestDTO productoRequestDTO) {
		ProductoEntity productoEntity = buscarPorIDProducto(id);
		productoEntity.setActivo(productoRequestDTO.getActivo());
		productoEntity.setClaveProducto(productoRequestDTO.getClaveProducto());
		productoEntity.setFechaRegistro(productoRequestDTO.getFechaRegistro());
		productoEntity.setId(productoRequestDTO.getId());
		productoEntity.setIdentificadorNegocio(productoRequestDTO.getIdentificadorNegocio());
		productoEntity.setNombre(productoRequestDTO.getNombre());
		productoEntity.setPrecio(productoRequestDTO.getPrecio());
		productoRepository.save(productoEntity);
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoEntity buscarPorIDProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	}

	@Override
	public List<ProductoEntity> listarTodos() {
		return productoRepository.findAll();
	}
	
	

}
