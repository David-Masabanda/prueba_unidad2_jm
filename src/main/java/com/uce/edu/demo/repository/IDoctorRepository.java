package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar(Doctor d);
	public void eliminarId(Integer id);
	public Doctor buscarId(Integer id);
	public void actualizar(Doctor d);
	
	public Doctor buscarCedula(String cedula);
	
}
