package com.davidweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidweb.entity.Alumno;
import com.davidweb.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public void insertarAlumno(Alumno obj) {
		repository.save(obj);

	}

}
