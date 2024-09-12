package pe.edu.upeu.bdcaso.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.bdcaso.dao.PeliculaDao;
import pe.edu.upeu.bdcaso.entity.Pelicula;
import pe.edu.upeu.bdcaso.repository.PeliculaRepository;

@Component
public class PeliculaDaoImpl implements PeliculaDao {

	@Autowired
	private PeliculaRepository peliculaRepository;
	
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculaRepository.deleteById(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return peliculaRepository.findById(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return peliculaRepository.findAll();
	}

}
