package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor d) {
		this.entityManager.persist(d);
	}

	@Override
	public void eliminarId(Integer id) {
		Doctor d=this.buscarId(id);
		this.entityManager.remove(d);
	
	}

	@Override
	public Doctor buscarId(Integer id) {
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.entityManager.merge(d);
	}

	@Override
	public Doctor buscarCedula(String cedula) {
		TypedQuery<Doctor> myQuery=this.entityManager.createQuery("SELECT d FROM Doctor d WHERE d.cedula =:datoCedula", Doctor.class);
		myQuery.setParameter("datoCedula",cedula);
		return myQuery.getSingleResult();
	}

}
