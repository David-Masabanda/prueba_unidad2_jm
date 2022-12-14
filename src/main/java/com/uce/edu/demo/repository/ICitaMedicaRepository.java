package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.CitaReporte;

public interface ICitaMedicaRepository {
	
	public void actualizar(CitaMedica c);
	public void insertar(CitaMedica c);
	public CitaMedica buscarNumero(String numero);
	public List<CitaReporte> consultarCitas(LocalDateTime fecha, BigDecimal costo);
}
