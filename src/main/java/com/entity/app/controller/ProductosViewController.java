package com.entity.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.entity.app.dtos.ProductoRequestDTO;
import com.entity.app.dtos.ProductoResponseDTO;
import com.entity.app.entity.ProductoEntity;
import com.entity.app.service.AltasBajasCambiosService;
import com.entity.app.service.impl.AltasBajasCambiosServiceImpl;

@Controller
//@RestController
@RequestMapping("/vistas")
public class ProductosViewController {
	
	private final AltasBajasCambiosService altasBajasCambiosService;

	public ProductosViewController(AltasBajasCambiosService altasBajasCambiosService) {
		this.altasBajasCambiosService = altasBajasCambiosService;
	}
	
	@GetMapping("/productos")
	public String listarProductos(Model model) {
		model.addAttribute("productos", altasBajasCambiosService.listarTodos());
		return "productos/lista";
	}
	
	@GetMapping("/productos/nuevo")
	public String mostrarFormularioNuevo (Model model) {
		model.addAttribute("producto", new ProductoRequestDTO());
		model.addAttribute("esNuevo", true);
		return "productos/formulario";
	}
	
	@PostMapping("/productos")
	public String guardarProducto(@ModelAttribute ProductoRequestDTO productoRequestDTO, RedirectAttributes redirectAttributes) {
		altasBajasCambiosService.addProducto(productoRequestDTO);
		redirectAttributes.addFlashAttribute("mensaje", "Producto creado exitosamente");
		return "redirect:/vistas/productos";
	}
	
	/*@PostMapping("/productos")
	public ProductoResponseDTO guardarProductos(@RequestBody ProductoRequestDTO productoRequestDTO) {
		return altasBajasCambiosService.addProducto(productoRequestDTO);
	}*/
	
	@GetMapping("/productos/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
		ProductoEntity producto = altasBajasCambiosService.buscarPorIDProducto(id);
		ProductoRequestDTO productoDTO = new ProductoRequestDTO();
		productoDTO.setActivo(producto.getActivo());
		productoDTO.setClaveProducto(producto.getClaveProducto());
		productoDTO.setFechaRegistro(producto.getFechaRegistro());
		productoDTO.setId(producto.getId());
		productoDTO.setIdentificadorNegocio(producto.getIdentificadorNegocio());
		productoDTO.setNombre(producto.getNombre());
		productoDTO.setPrecio(producto.getPrecio());
		productoDTO.setUsuarioAuditor(producto.getUsuarioAuditor());
		
		model.addAttribute("producto", productoDTO);
		model.addAttribute("esNuevo", false);
		model.addAttribute("id", id);
		return "productos/formulario";
	}
	
}
