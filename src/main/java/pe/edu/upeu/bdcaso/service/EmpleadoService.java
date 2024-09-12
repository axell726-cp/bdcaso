package pe.edu.upeu.bdcaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.bdcaso.entity.Empleado;

public interface EmpleadoService {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
