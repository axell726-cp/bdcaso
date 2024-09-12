package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.RolDao;
import pe.edu.upeu.bdcaso.entity.Rol;
import pe.edu.upeu.bdcaso.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao dao;
	
	@Override
	public Rol create(Rol ro) {
		// TODO Auto-generated method stub
		return dao.create(ro);
	}

	@Override
	public Rol update(Rol ro) {
		// TODO Auto-generated method stub
		return dao.update(ro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
