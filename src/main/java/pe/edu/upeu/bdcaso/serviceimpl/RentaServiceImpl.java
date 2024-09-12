package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.RentaDao;
import pe.edu.upeu.bdcaso.entity.Renta;
import pe.edu.upeu.bdcaso.service.RentaService;

@Service
public class RentaServiceImpl implements RentaService {

	@Autowired
	private RentaDao dao;
	
	@Override
	public Renta create(Renta re) {
		// TODO Auto-generated method stub
		return dao.create(re);
	}

	@Override
	public Renta update(Renta re) {
		// TODO Auto-generated method stub
		return dao.update(re);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
