package pe.edu.upeu.bdcaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.bdcaso.entity.Genero;

public interface GeneroService {
	Genero create(Genero g);
	Genero update(Genero g);
	void delete(Long id);
	Optional<Genero> read(Long id);
	List<Genero> readAll();
}
