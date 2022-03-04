package com.gibson.projetoSpring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gibson.projetoSpring.domain.Categoria;
import com.gibson.projetoSpring.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository reposit;
	
	public Categoria buscar(Integer id) {
		Optional <Categoria> obj = reposit.findById(id);
		return obj.orElse(null);
	}
}
