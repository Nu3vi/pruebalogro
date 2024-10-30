package com.cubas.pruebalogro.repository;

import com.cubas.pruebalogro.entity.Denuncia;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
    List<Denuncia> findByTituloContaining(String titulo, Pageable page);

}
