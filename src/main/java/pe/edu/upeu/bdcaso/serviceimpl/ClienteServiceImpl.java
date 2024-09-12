package pe.edu.upeu.bdcaso.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.bdcaso.dao.ClienteDao;
import pe.edu.upeu.bdcaso.entity.Cliente;
import pe.edu.upeu.bdcaso.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao dao;
	
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
