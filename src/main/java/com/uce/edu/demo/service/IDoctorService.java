package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorService {

	public void insertar(Doctor d);
	public void eliminarId(Integer id);
	public Doctor buscarId(Integer id);
	public void actualizar(Doctor d);
	
	public Doctor buscarCedula(String cedula);
}
