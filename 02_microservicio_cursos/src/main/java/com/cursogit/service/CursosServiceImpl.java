package com.cursogit.service;

import java.util.ArrayList;
import java.util.List;

import com.cursogit.model.Curso;

public class CursosServiceImpl implements CursosService{

	static List<Curso> cursos=new ArrayList<> (List.of(
			new Curso("Java básico",60,190,"Programación"),
			new Curso("Python",80,100,"Programación"),
			new Curso("Html",50,80,"Web"),
			new Curso("Linux",100,220,"Sistemas"),
			new Curso("Angular",90,170,"Web")
			));
			
	
	@Override
	public List<Curso> buscarPorTematica(String tematica) {
		return cursos.stream()
				     .filter(c->c.getTematica().equals(tematica))
				     .toList();
	}

}
