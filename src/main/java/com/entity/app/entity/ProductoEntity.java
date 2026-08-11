package com.entity.app.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "productos") 
public class ProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "identificador_negocio", unique = true, nullable = false, length = 50)
	private String identificadorNegocio;

	@Column(name = "clave_producto", length = 10, nullable = false)
	private String claveProducto;

	@Column(name = "nombre_producto", length = 200, nullable = false)
	private String nombre;

	@Column(name = "precio", precision = 10, scale = 2, nullable = false)
	private BigDecimal precio;

	@Column(name = "indicador_vigencia", nullable = false)
	private Boolean activo;

	@Column(name = "fecha_registro", nullable = false, updatable = false)
	//@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;

	@Column(name = "usuario_auditor", length = 50, nullable = false)
	private String usuarioAuditor; 

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
	
	public static Builder builder() {
		return new Builder();
	}
	
	
	public static class Builder {
		private Long id;
		private String identificadorNegocio;
		private String claveProducto;
		private String nombre;
		private BigDecimal precio;
		private Boolean activo;
		private Date fechaRegistro;
		private String usuarioAuditor;
		
		public Builder id(Long id) {
			this.id = id;
			return this;
		}
		
		public Builder identificadorNegocio(String identificadorNegocio) {
			this.identificadorNegocio = identificadorNegocio;
			return this;
		}
		
		public Builder claveProducto(String claveProducto) {
			this.claveProducto = claveProducto;
			return this;
		}
		
		public Builder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public Builder precio(BigDecimal precio) {
			this.precio = precio;
			return this;
		}
		
		public Builder activo(Boolean activo) {
			this.activo = activo;
			return this;
		}
		
		public Builder fechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
			return this;
		}
		
		public Builder usuarioAuditor(String usuarioAuditor) {
			this.usuarioAuditor = usuarioAuditor;
			return this;
		}
		
		public ProductoEntity build() {
			ProductoEntity productoEntity = new ProductoEntity();
			productoEntity.setId(this.id);
			productoEntity.setIdentificadorNegocio(this.identificadorNegocio);
			productoEntity.setClaveProducto(this.claveProducto);
			productoEntity.setNombre(this.nombre);
			productoEntity.setPrecio(this.precio);
			productoEntity.setActivo(this.activo);
			productoEntity.setFechaRegistro(this.fechaRegistro);
			productoEntity.setUsuarioAuditor(this.usuarioAuditor);
			return productoEntity;
		}
		
	}
	
}
