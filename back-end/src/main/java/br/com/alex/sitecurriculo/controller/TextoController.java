package br.com.alex.literabyte.controller;

import br.com.alex.literabyte.model.dto.TextoDto;
import br.com.alex.literabyte.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/literabyte/texto")
public class TextoController {

    @Autowired
    TextoService textoService;

    @GetMapping("/teste")
    public String testeTextoController(){
        return "Ok, teste sucesso";
    }

    @GetMapping("/{id}")
    public ResponseEntity<TextoDto> buscaTexto(@PathVariable Long id){
        Optional<TextoDto> textoRetornado = textoService.buscarTexto(id);
        return textoRetornado.isPresent() ?
                ResponseEntity.ok(textoRetornado.get()) : ResponseEntity.notFound().build();

    }

    @GetMapping("/todos")
    public ResponseEntity<List<TextoDto>> buscaTextos(){
        List<TextoDto> textosRetornados = textoService.buscarTextos();
        return !textosRetornados.isEmpty() ?
                ResponseEntity.ok(textosRetornados) : ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastra")
    public ResponseEntity<TextoDto> cadastrarTexto(@RequestBody TextoDto request){
        Optional<TextoDto> textoRetorno = textoService.cadastrarTexto(request);
        return textoRetorno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
