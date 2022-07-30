package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteService {

	public void insertar(Paciente p);
	public void eliminarId(Integer id);
	public Paciente buscarId(Integer id);
	public void actualizar(Paciente p);
	
	public Paciente buscarCedula(String cedula);
}
