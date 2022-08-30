package br.com.alex.sitecurriculo.model.dao;

import br.com.alex.sitecurriculo.model.entity.Texto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TextoRepository extends JpaRepository<Texto, Long> {

    Optional<Texto> findById(Long id);
}
