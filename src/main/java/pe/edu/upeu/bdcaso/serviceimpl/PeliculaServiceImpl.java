package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.PeliculaDao;
import pe.edu.upeu.bdcaso.entity.Pelicula;
import pe.edu.upeu.bdcaso.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaDao dao;
	
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return dao.create(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return dao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
