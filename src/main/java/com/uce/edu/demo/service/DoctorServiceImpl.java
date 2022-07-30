package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void insertar(Doctor d) {
		this.doctorRepository.insertar(d);
	}

	@Override
	public void eliminarId(Integer id) {
		this.doctorRepository.eliminarId(id);
	}

	@Override
	public Doctor buscarId(Integer id) {
		return this.doctorRepository.buscarId(id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.doctorRepository.actualizar(d);
	}

	@Override
	public Doctor buscarCedula(String cedula) {
		return this.doctorRepository.buscarCedula(cedula);
	}

}
