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
import pe.edu.upeu.bdcaso.entity.Renta;
import pe.edu.upeu.bdcaso.service.RentaService;

@RestController
@RequestMapping("/api/rentas")
public class RentaController {
	@Autowired
	private RentaService rentaService;
	
	@GetMapping
	public ResponseEntity<List<Renta>> readAll(){
		try {
			List<Renta> Rentas = rentaService.readAll();
			if(Rentas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Rentas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Renta> crear(@Valid @RequestBody Renta ren){
		try {
			Renta re = rentaService.create(ren);
			return new ResponseEntity<>(re, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Renta> getRentaId(@PathVariable("id") Long id){
		try {
			Renta re = rentaService.read(id).get();
			return new ResponseEntity<>(re, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Renta> delRenta(@PathVariable("id") Long id){
		try {
			rentaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRenta(@PathVariable("id") Long id, @Valid @RequestBody Renta ren){

			Optional<Renta> re = rentaService.read(id);
			if(re.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(rentaService.update(ren), HttpStatus.OK);
			}		
		
	}
}
