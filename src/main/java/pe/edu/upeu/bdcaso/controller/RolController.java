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
import pe.edu.upeu.bdcaso.entity.Rol;
import pe.edu.upeu.bdcaso.service.RolService;

@RestController
@RequestMapping("/api/roles")
public class RolController {
	@Autowired
	private RolService rolService;
	
	@GetMapping
	public ResponseEntity<List<Rol>> readAll(){
		try {
			List<Rol> Roles = rolService.readAll();
			if(Roles.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Roles, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Rol> crear(@Valid @RequestBody Rol rol){
		try {
			Rol ro = rolService.create(rol);
			return new ResponseEntity<>(ro, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Rol> getRolId(@PathVariable("id") Long id){
		try {
			Rol ro = rolService.read(id).get();
			return new ResponseEntity<>(ro, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Rol> delRol(@PathVariable("id") Long id){
		try {
			rolService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRol(@PathVariable("id") Long id, @Valid @RequestBody Rol rol){

			Optional<Rol> ro = rolService.read(id);
			if(ro.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else {
				return new ResponseEntity<>(rolService.update(rol), HttpStatus.OK);
			}		
		
	}
}
