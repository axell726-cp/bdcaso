package pe.edu.upeu.bdcaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.bdcaso.entity.Rol;

public interface RolService {
	Rol create(Rol ro);
	Rol update(Rol ro);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
