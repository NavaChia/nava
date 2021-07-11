package com.davidweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidweb.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
