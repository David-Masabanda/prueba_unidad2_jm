package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente p) {
		this.entityManager.persist(p);
	}

	@Override
	public void eliminarId(Integer id) {
		Paciente p=this.buscarId(id);
		this.entityManager.remove(p);
	}

	@Override
	public Paciente buscarId(Integer id) {
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Paciente p) {
		this.entityManager.merge(p);
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		TypedQuery<Paciente> myQuery=this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula =:datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula",cedula);
		return myQuery.getSingleResult();
	}

}
