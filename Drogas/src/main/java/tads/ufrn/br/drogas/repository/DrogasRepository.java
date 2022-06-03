package tads.ufrn.br.drogas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.ufrn.br.drogas.domain.Drogas;

public interface DrogasRepository extends JpaRepository<Drogas, Long> {

}
