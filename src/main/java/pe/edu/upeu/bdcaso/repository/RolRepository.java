package pe.edu.upeu.bdcaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.bdcaso.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
