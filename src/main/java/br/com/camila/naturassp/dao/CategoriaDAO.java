package br.com.camila.naturassp.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.camila.naturassp.model.Categoria;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer>{
	
	// consultas customizadas
	
	/**
	 * 1 - Categoria por palavra chave
	 */
	public ArrayList<Categoria> findByNomeContaining(String palavra);

}
