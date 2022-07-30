package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente p);
	public void eliminarId(Integer id);
	public Paciente buscarId(Integer id);
	public void actualizar(Paciente p);
	
	public Paciente buscarCedula(String cedula);
}
