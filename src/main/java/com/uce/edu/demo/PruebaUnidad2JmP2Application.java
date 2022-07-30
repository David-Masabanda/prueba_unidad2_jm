package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IGestorCitasService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2JmP2Application implements CommandLineRunner{
	
	private static Logger LOG =Logger.getLogger(PruebaUnidad2JmP2Application.class);
	
	@Autowired
	private IGestorCitasService gestorCitasService;
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService pacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2JmP2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doctor d1=new Doctor();
		d1.setCedula("1719139881");
		d1.setNombre("David");
		d1.setApellido("Torres");
		d1.setFechaNacimiento(LocalDateTime.of(1987, 1, 17, 0, 0, 0));
		d1.setNumeroConsultorio("8");
		d1.setTitulo("Pediatria");
		d1.setSalario(new BigDecimal(2500));
		
		this.doctorService.insertar(d1);
		
		Doctor d2=new Doctor();
		d2.setCedula("1719139980");
		d2.setNombre("Sofia");
		d2.setApellido("Lopez");
		d2.setFechaNacimiento(LocalDateTime.of(1992, 5, 21, 0, 0, 0));
		d2.setNumeroConsultorio("10");
		d2.setTitulo("Dermatologia");
		d2.setSalario(new BigDecimal(2700));
		
		this.doctorService.insertar(d2);
		
		
		Paciente p1=new Paciente();
		p1.setCedula("1719131010");
		p1.setNombre("Andrea");
		p1.setApellido("Ordoñez");
		p1.setFechaNacimiento(LocalDateTime.of(1999, 2, 17, 0, 0, 0));
		p1.setCodigoIess("1012");
		p1.setEstatura("1.68");
		p1.setPeso("59");
		p1.setGenero("Femenino");
		
		this.pacienteService.insertar(p1);
		
		Paciente p2=new Paciente();
		p2.setCedula("1719131020");
		p2.setNombre("Martha");
		p2.setApellido("Loza");
		p2.setFechaNacimiento(LocalDateTime.of(1999, 2, 17, 0, 0, 0));
		p2.setCodigoIess("1013");
		p2.setEstatura("1.71");
		p2.setPeso("61");
		p2.setGenero("Femenino");
		
		this.pacienteService.insertar(p2);
	}

}
