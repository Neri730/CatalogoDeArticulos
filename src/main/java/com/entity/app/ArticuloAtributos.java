package com.entity.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArticuloAtributos {
	
	int idTecnico;
	
	public int getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}
	
	String idNegocio;
	String prefijo;
	DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	LocalDateTime fechaHora = LocalDateTime.now();
	
	public String getIdNegocio() {
		return idNegocio;
	}
	public void setIdNegocio(String idNegocio) {
		this.idNegocio = idNegocio;
	}

	String claveProducto;
	
	public String getClaveProducto() {
		return claveProducto;
	}

	public void setClaveProducto(String claveProducto) {
		if (claveProducto.length() > 10) {
			System.out.println("La clave del producto excede el limite de caracteres");
		}else {
			this.claveProducto = claveProducto;
		}
	}
	
	String nombreProducto;

	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		if (nombreProducto.length() > 200) {
			System.out.println("El nombre del producto excede el limite de caracteres");
		}else {
			this.nombreProducto = nombreProducto;
		}
	}
	
	BigDecimal precio;

	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio.setScale(2, RoundingMode.DOWN);
	}
	
	//DateTimeFormatter vigencia;

	
	//DateTimeFormatter registro;

	
	
	String auditor;

	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	
}
