package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaReporte;

public interface IGestorCitasService {
	
	public void guardarCita(String cedulaDoctor, String cedulaPaciente, String numero, LocalDateTime fecha, BigDecimal costo, String lugar);
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl);
	public List<CitaReporte> reporteCitas(LocalDateTime fecha, BigDecimal precio);
}
