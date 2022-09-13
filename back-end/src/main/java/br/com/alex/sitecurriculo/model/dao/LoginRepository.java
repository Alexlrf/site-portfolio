package br.com.alex.sitecurriculo.model.dao;

import br.com.alex.sitecurriculo.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    Optional<Login> findByLogin(String login);
}
