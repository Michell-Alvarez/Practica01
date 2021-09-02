package com.empresa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.entity.Alumno;

import com.empresa.service.AlumnoService;

@RestController
@RequestMapping("/rest/alumno")
public class AlumnoController {

	
	@Autowired
	private AlumnoService servcie;

	//Todo lo que selecciona por standar es @GetMapping
	//@ResponseBody Quiere decir que va a retornar Json
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Alumno>> listarAlumno(){
		List<Alumno> lista = servcie.listaAlumno();
		return ResponseEntity.ok(lista);
	}

	//Todo lo que es insertar es por standar un @PostMapping
	@PostMapping
	@ResponseBody
	public ResponseEntity<Alumno> insertaAlumno(@RequestBody Alumno obj){
		Alumno objSalida = servcie.insertaActualizaAlumno(obj);
		return ResponseEntity.ok(objSalida);
	}
	
	//Actualizar es @PutMapping
	//Eliminar es @DeleteMapping
	
	/*
	 * Para probar el Get (Select)
		http://localhost:8090/rest/alumno

	*/

	/*
	 *Para probar las demás sentencias, también se puede hacer con el programa insommia
	https://reqbin.com/
	--Adentro colocar la URI y luego dar clicl en send
	http://localhost:8090/rest/alumno

	 * 
	 */
}
