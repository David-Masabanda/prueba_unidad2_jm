package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaReporte {

	private String numeroCita;
	private LocalDateTime fechaCita;
	private BigDecimal costo;
	private LocalDateTime fechaControl;
	
	public CitaReporte(String numeroCita, LocalDateTime fechaCita, BigDecimal costo, LocalDateTime fechaControl) {
		this.numeroCita=numeroCita;
		this.fechaCita=fechaCita;
		this.costo=costo;
		this.fechaControl=fechaControl;
		
	}

	//SET y GET
	public String getNumeroCita() {
		return numeroCita;
	}

	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	@Override
	public String toString() {
		return "CitaReporte [numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", costo=" + costo
				+ ", fechaControl=" + fechaControl + "]";
	}

	

	
	
}
