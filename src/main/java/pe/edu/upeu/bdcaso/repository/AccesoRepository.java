package pe.edu.upeu.bdcaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.bdcaso.entity.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{

}

