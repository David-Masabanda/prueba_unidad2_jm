package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.CitaReporte;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;

@Component
public class GestorCitasServiceImpl implements  IGestorCitasService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void guardarCita(String cDoctor, String cPaciente, String numero, LocalDateTime fecha, BigDecimal costo, String lugar) {
		Doctor doctor=this.doctorRepository.buscarCedula(cDoctor);
		Paciente paciente= this.pacienteRepository.buscarCedula(cPaciente);
		
		CitaMedica cita=new CitaMedica();
		cita.setNumero(numero);
		cita.setFechaCita(fecha);
		cita.setValorCita(costo);
		cita.setLugarCita(lugar);
		cita.setDoctor(doctor);
		cita.setPaciente(paciente);
		
		this.citaMedicaRepository.insertar(cita);
		
	}

	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		
		CitaMedica cita=this.citaMedicaRepository.buscarNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaControl(fechaControl);
		
		this.citaMedicaRepository.actualizar(cita);
	}

	@Override
	public List<CitaReporte> reporteCitas(LocalDateTime fecha, BigDecimal precio) {
		return this.citaMedicaRepository.consultarCitas(fecha, precio);
	}

}
