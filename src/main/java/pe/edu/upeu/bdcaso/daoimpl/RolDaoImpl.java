package pe.edu.upeu.bdcaso.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.bdcaso.dao.RolDao;
import pe.edu.upeu.bdcaso.entity.Rol;
import pe.edu.upeu.bdcaso.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao {

	@Autowired
	private RolRepository rolRepository;
	
	@Override
	public Rol create(Rol ro) {
		// TODO Auto-generated method stub
		return rolRepository.save(ro);
	}

	@Override
	public Rol update(Rol ro) {
		// TODO Auto-generated method stub
		return rolRepository.save(ro);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
