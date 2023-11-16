package br.edu.unicesumar.crud.model.repository;

import br.edu.unicesumar.crud.model.domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
