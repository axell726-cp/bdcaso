package pe.edu.upeu.bdcaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.bdcaso.entity.Renta;

public interface RentaService {
	Renta create(Renta re);
	Renta update(Renta re);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta> readAll();
}
