package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.GeneroDao;
import pe.edu.upeu.bdcaso.entity.Genero;
import pe.edu.upeu.bdcaso.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {

	@Autowired
	private GeneroDao dao;
	
	@Override
	public Genero create(Genero g) {
		// TODO Auto-generated method stub
		return dao.create(g);
	}

	@Override
	public Genero update(Genero g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}