package br.com.alex.sitecurriculo.controller;

import br.com.alex.sitecurriculo.model.dto.TextoDto;
import br.com.alex.sitecurriculo.model.entity.Texto;
import br.com.alex.sitecurriculo.service.TextoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sitecurriculo/texto")
public class TextoController {

    @Autowired
    TextoService textoService;

    private static final Logger logger = LoggerFactory.getLogger(TextoController.class);

    @GetMapping("/teste")
    public String testeTextoController(){
        return "Ok, teste sucesso";
    }

    @GetMapping("/{id}")
    public ResponseEntity<TextoDto> buscaTexto(@PathVariable Long id){
        Texto textoRetornado = textoService.buscarTexto(id);
        var textoRetornadoDto = new TextoDto();
        BeanUtils.copyProperties(textoRetornado, textoRetornadoDto);
        return ResponseEntity.ok(textoRetornadoDto);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<TextoDto>> buscaTextos(){
        List<Texto> textosRetornados = textoService.buscarTextos();
        List<TextoDto> textoRetornadoDto = new ArrayList<>();
        BeanUtils.copyProperties(textosRetornados, textoRetornadoDto);
        return !textosRetornados.isEmpty() ?
                ResponseEntity.ok(textoRetornadoDto) : ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastra")
    public ResponseEntity<?> cadastrarTexto(@RequestBody @Valid TextoDto request){
        logger.info("método - cadastrarTexto");
        var texto = new Texto();
        BeanUtils.copyProperties(request, texto);
        Optional<Texto> textoRetorno = textoService.cadastrarTexto(texto);
        return textoRetorno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
