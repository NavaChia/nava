package com.davidweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.davidweb.entity.Alumno;
import com.davidweb.service.AlumnoService;
import com.davidweb.service.AlumnoServiceImpl;

//Controllador de la App Web
@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	//Quiero probar a guardar en bbdd a traves de AlumnoServiceimpl
	private AlumnoServiceImpl service2;
	
	@RequestMapping("/verAlumno")
	public String ver() {
		return "registraAlumno";
	}
	
	@RequestMapping("/registroDeAlumno")
	public String registrar(Alumno obj) {
		
		// Inserción Manual de un Alumno
		Alumno alu = new Alumno();
		alu.setNombre("Marina");
		alu.setCorreo("marinamarina@hotmail.com");
		alu.setDni("50891352Y");
		service.insertarAlumno(alu);
		
		service.insertarAlumno(obj);
		return "registraAlumno";
	}

}
