package pe.edu.upeu.bdcaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.bdcaso.entity.Empleado;

public interface EmpleadoDao {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
