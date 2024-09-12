package pe.edu.upeu.bdcaso.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.bdcaso.dao.AccesoDao;
import pe.edu.upeu.bdcaso.entity.Acceso;
import pe.edu.upeu.bdcaso.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao {

	@Autowired
	private AccesoRepository accesoRepository;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoRepository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoRepository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoRepository.findAll();
	}

}
