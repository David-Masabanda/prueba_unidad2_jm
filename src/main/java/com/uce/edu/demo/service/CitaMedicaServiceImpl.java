package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.CitaReporte;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;

	@Override
	public void actualizar(CitaMedica c) {
		this.citaMedicaRepository.actualizar(c);
	}

	@Override
	public void insertar(CitaMedica c) {
		this.citaMedicaRepository.insertar(c);
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitaReporte> consultarCitas(LocalDateTime fecha, BigDecimal costo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
