package br.com.alex.literabyte.service;

import br.com.alex.literabyte.model.dao.TextoRepository;
import br.com.alex.literabyte.model.dto.TextoDto;
import br.com.alex.literabyte.model.entity.Texto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TextoService {

    @Autowired
    TextoRepository textoRepository;
    public Optional<TextoDto> cadastrarTexto(TextoDto request) {
        Texto texto = new Texto(request);
        TextoDto textoRetorno = new TextoDto(textoRepository.save(texto));
        return Optional.of(textoRetorno);
    }

    public Optional<TextoDto> buscarTexto(Long id) {
        return Optional.of(new TextoDto(textoRepository.findById(id).get()));
    }

    public List<TextoDto> buscarTextos() {
        return textoRepository.findAll().stream().map(text -> new TextoDto(text)).collect(Collectors.toList());
    }
}
