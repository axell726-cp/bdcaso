package pe.edu.upeu.bdcaso.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.bdcaso.dao.RentaDao;
import pe.edu.upeu.bdcaso.entity.Renta;
import pe.edu.upeu.bdcaso.repository.RentaRepository;

@Component
public class RentaDaoImpl implements RentaDao {

	@Autowired
	private RentaRepository rentaRepository;
	
	@Override
	public Renta create(Renta re) {
		// TODO Auto-generated method stub
		return rentaRepository.save(re);
	}

	@Override
	public Renta update(Renta re) {
		// TODO Auto-generated method stub
		return rentaRepository.save(re);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rentaRepository.deleteById(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return rentaRepository.findById(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return rentaRepository.findAll();
	}

}
