package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.CitaReporte;
import com.uce.edu.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<CitaReporte> consultarCitas(LocalDateTime fecha, BigDecimal costo) {
		TypedQuery<CitaReporte> myQuery=this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.CitaReporte(c.numero, c.fechaCita, c.valorCita, c.fechaControl) FROM cita_medica c WHERE c.fechaCita > :datoFecha AND c.valorCita> :datoPrecio",
				CitaReporte.class);
		myQuery.setParameter("datoFecha", fecha);
		myQuery.setParameter("datoPrecio", costo);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(CitaMedica c) {
		this.entityManager.persist(c);
	}

	@Override
	public void actualizar(CitaMedica c) {
		this.entityManager.merge(c);
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		Query myQuery=this.entityManager.createQuery("SELECT c FROM cita_medica c WHERE c.numero =:datoNumero");
		myQuery.setParameter("datoNumero",numero);
		return (CitaMedica)myQuery.getSingleResult();
	}

}
