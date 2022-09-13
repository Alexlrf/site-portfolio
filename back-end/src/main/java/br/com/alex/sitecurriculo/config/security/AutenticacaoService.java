package br.com.alex.sitecurriculo.config.security;

import br.com.alex.sitecurriculo.model.dao.LoginRepository;
import br.com.alex.sitecurriculo.model.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Login> login = loginRepository.findByLogin(username);
        if (login.isPresent()){
            return login.get();
        }
        throw new UsernameNotFoundException("Dados informados estão incorretos!");
    }
}
