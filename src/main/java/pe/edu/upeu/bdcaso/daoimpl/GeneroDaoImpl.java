package pe.edu.upeu.bdcaso.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.bdcaso.dao.GeneroDao;
import pe.edu.upeu.bdcaso.entity.Genero;
import pe.edu.upeu.bdcaso.repository.GeneroRepository;

@Component
public class GeneroDaoImpl implements GeneroDao {

	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	public Genero create(Genero g) {
		// TODO Auto-generated method stub
		return generoRepository.save(g);
	}

	@Override
	public Genero update(Genero g) {
		// TODO Auto-generated method stub
		return generoRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		generoRepository.deleteById(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return generoRepository.findById(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return generoRepository.findAll();
	}

}
