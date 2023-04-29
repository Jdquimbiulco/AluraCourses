package com.latam.alura.tienda.vo;

import java.time.LocalDate;

public class RelatorioDeVenta {
	
	private String nombreDelProducto;
	private Long cantidadDelProducto;
	private LocalDate fechaDeUltimaVenta;
	
	public RelatorioDeVenta(String nombreDelProducto, Long cantidadDelProducto, LocalDate fechaDeUltimaVenta) {
		this.nombreDelProducto = nombreDelProducto;
		this.cantidadDelProducto = cantidadDelProducto;
		this.fechaDeUltimaVenta = fechaDeUltimaVenta;
	}

	public String getNombreDelProducto() {
		return nombreDelProducto;
	}

	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public Long getCantidadDelProducto() {
		return cantidadDelProducto;
	}

	public void setCantidadDelProducto(Long cantidadDelProducto) {
		this.cantidadDelProducto = cantidadDelProducto;
	}

	public LocalDate getFechaDeUltimaVenta() {
		return fechaDeUltimaVenta;
	}

	public void setFechaDeUltimaVenta(LocalDate fechaDeUltimaVenta) {
		this.fechaDeUltimaVenta = fechaDeUltimaVenta;
	}

	@Override
	public String toString() {
		return "RelatorioDeVenta [nombreDelProducto=" + nombreDelProducto + ", cantidadDelProducto="
				+ cantidadDelProducto + ", fechaDeUltimaVenta=" + fechaDeUltimaVenta + "]";
	}
	
	
	
}
