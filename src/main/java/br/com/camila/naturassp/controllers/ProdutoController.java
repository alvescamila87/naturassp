package br.com.camila.naturassp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.camila.naturassp.dao.ProdutoDAO;
import br.com.camila.naturassp.model.Produto;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO dao;
	
	@GetMapping("/produtos")
	public ArrayList<Produto> listarTodos(){
		return (ArrayList<Produto>) dao.findAllByCategoria(null);
	}
	
	

}
