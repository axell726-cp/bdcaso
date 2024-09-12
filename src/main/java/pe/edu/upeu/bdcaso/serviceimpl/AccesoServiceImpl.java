package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.AccesoDao;
import pe.edu.upeu.bdcaso.entity.Acceso;
import pe.edu.upeu.bdcaso.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesoDao dao;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}