package com.entity.app.dtos;

import java.math.BigDecimal;
import java.sql.Date;

public class ProductoResponseDTO {

	private Long id;
	private String identificadorNegocio;
	private String claveProducto;
	private String nombre;
	private BigDecimal precio;
	private Boolean activo;
	private Date fechaRegistro;
	private String usuarioAuditor;
	
	public ProductoResponseDTO() {
	}

	public ProductoResponseDTO(Long id, String identificadorNegocio, String claveProducto, String nombre,
			BigDecimal precio, Boolean activo, Date fechaRegistro, String usuarioAuditor) {
		this.id = id;
		this.identificadorNegocio = identificadorNegocio;
		this.claveProducto = claveProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.activo = activo;
		this.fechaRegistro = fechaRegistro;
		this.usuarioAuditor = usuarioAuditor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificadorNegocio() {
		return identificadorNegocio;
	}

	public void setIdentificadorNegocio(String identificadorNegocio) {
		this.identificadorNegocio = identificadorNegocio;
	}

	public String getClaveProducto() {
		return claveProducto;
	}

	public void setClaveProducto(String claveProducto) {
		this.claveProducto = claveProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUsuarioAuditor() {
		return usuarioAuditor;
	}

	public void setUsuarioAuditor(String usuarioAuditor) {
		this.usuarioAuditor = usuarioAuditor;
	}

	@Override
	public String toString() {
		return "ProductoResponseDTO [id=" + id + ", identificadorNegocio=" + identificadorNegocio + ", claveProducto="
				+ claveProducto + ", nombre=" + nombre + ", precio=" + precio + ", activo=" + activo
				+ ", fechaRegistro=" + fechaRegistro + ", usuarioAuditor=" + usuarioAuditor + "]";
	}
	
}
