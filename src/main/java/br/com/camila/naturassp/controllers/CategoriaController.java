package br.com.camila.naturassp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.camila.naturassp.model.Categoria;
import br.com.camila.naturassp.services.ICategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private ICategoriaService service;
    	
	@GetMapping("/categorias")
	public ResponseEntity<ArrayList<Categoria>> listarTodas(){
		return ResponseEntity.ok().body(service.recuperarTodasCategorias());
	}
	
	@GetMapping("/categorias/search")
	public ResponseEntity<ArrayList<Categoria>> listarPorPalavraChave(@RequestParam(name="key") String palavraChave){
		if(palavraChave != null) {
			return ResponseEntity.ok().body(service.recuperarPorPalavraChave(palavraChave));
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/categorias/{palavraChave}")
	public ResponseEntity<ArrayList<Categoria>> listarPorPalavraChave2(@PathVariable String palavraChave){
		if(palavraChave != null) {
			return ResponseEntity.ok().body(service.recuperarPorPalavraChave(palavraChave));
		}
		return ResponseEntity.notFound().build();
	}
			
	@PostMapping("/categorias")
	public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria){
		Categoria resultado = service.inserirNovaCategoria(categoria);
		
		if(resultado != null ) {
			return ResponseEntity.status(201).body(resultado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/categorias")
	public ResponseEntity<Categoria> alterarDados(@RequestBody Categoria categoria){
		Categoria resultado = service.alterarCategoria(categoria);
		
		if(resultado != null) {
			return ResponseEntity.ok(resultado);
		}
		return ResponseEntity.badRequest().build();		
	}
	
	
}
