package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void insertar(Paciente p) {
		this.pacienteRepository.insertar(p);	
	}

	@Override
	public void eliminarId(Integer id) {
		this.pacienteRepository.eliminarId(id);
	}

	@Override
	public Paciente buscarId(Integer id) {
		return this.pacienteRepository.buscarId(id);
	}

	@Override
	public void actualizar(Paciente p) {
		this.pacienteRepository.actualizar(p);
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		return this.pacienteRepository.buscarCedula(cedula);
	}

}
