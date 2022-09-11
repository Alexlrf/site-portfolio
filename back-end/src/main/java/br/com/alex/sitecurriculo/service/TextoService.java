package br.com.alex.sitecurriculo.service;

import br.com.alex.sitecurriculo.model.dao.TextoRepository;
import br.com.alex.sitecurriculo.model.entity.Texto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TextoService {

    @Autowired
    TextoRepository textoRepository;

    @Transactional
    public Optional<Texto> cadastrarTexto(Texto request) {
        Texto textoRetorno = textoRepository.save(request);
        return Optional.of(textoRetorno);
    }

    public Texto buscarTexto(Long id) {
        return textoRepository.findById(id).get();
    }

    public List<Texto> buscarTextos() {
        return new ArrayList<>(textoRepository.findAll());
    }
}
