package dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import model.Categoria;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer>{
	
	// consultas customizadas
	
	/**
	 * 1 - Categoria por palavra chave
	 */
	public ArrayList<Categoria> findByNomeContaining(String palavra);

}
