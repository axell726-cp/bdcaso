package pe.edu.upeu.bdcaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.bdcaso.entity.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{

}

