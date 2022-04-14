package com.monica.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monica.cursomc.domain.Categoria;
import com.monica.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias") // esse eh o EndPoint
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria buscar = service.buscar(id);
		return ResponseEntity.ok().body(buscar);
	}

}
