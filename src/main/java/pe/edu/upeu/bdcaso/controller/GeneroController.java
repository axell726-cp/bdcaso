package pe.edu.upeu.bdcaso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.bdcaso.entity.Genero;
import pe.edu.upeu.bdcaso.service.GeneroService;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {
	@Autowired
	private GeneroService generoService;
	
	@GetMapping
	public ResponseEntity<List<Genero>> readAll(){
		try {
			List<Genero> Generos = generoService.readAll();
			if(Generos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Generos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Genero> crear(@Valid @RequestBody Genero gen){
		try {
			Genero g = generoService.create(gen);
			return new ResponseEntity<>(g, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Genero> getGeneroId(@PathVariable("id") Long id){
		try {
			Genero g = generoService.read(id).get();
			return new ResponseEntity<>(g, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Genero> delGenero(@PathVariable("id") Long id){
		try {
			generoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateGenero(@PathVariable("id") Long id, @Valid @RequestBody Genero gen){

			Optional<Genero> g = generoService.read(id);
			if(g.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(generoService.update(gen), HttpStatus.OK);
			}		
		
	}
}
