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
@Table(name = "productos") // Recomendación: especificar el nombre de la tabla
public class ProductoEntity {

	// Identificador Técnico - Ya lo tienes bien
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Identificador de Negocio - Campo que falta
	@Column(name = "identificador_negocio", unique = true, nullable = false, length = 50)
	private String identificadorNegocio; // Cadena única con prefijo, fecha y hora

	// Clave del Producto - Ajustar para que sea obligatorio
	@Column(name = "clave_producto", length = 10, nullable = false)
	private String claveProducto;

	// Nombre del Producto - Ajustar para que sea obligatorio
	@Column(name = "nombre_producto", length = 200, nullable = false)
	private String nombre;

	// Precio - Ya lo tienes bien (se usa BigDecimal para precisión decimal)
	@Column(name = "precio", precision = 10, scale = 2, nullable = false)
	private BigDecimal precio;

	// Indicador de Vigencia - Cambiar de Date a Boolean/Integer para indicar
	// activo/inactivo
	@Column(name = "indicador_vigencia", nullable = false)
	private Boolean activo; // true = activo, false = inactivo

	// Fecha de Registro - Ya lo tienes, pero ajustar nombre
	@Column(name = "fecha_registro", nullable = false, updatable = false)
	//@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;

	// Usuario Auditor - Corregir nombre del campo
	@Column(name = "usuario_auditor", length = 50, nullable = false)
	private String usuarioAuditor; // Cambiar de "userAditor" a "usuarioAuditor"

	// Getters y Setters
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
}
