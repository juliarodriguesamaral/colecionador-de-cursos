package br.com.trilhadev.colecionadordecursos.repository;

import br.com.trilhadev.colecionadordecursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
