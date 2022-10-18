package br.com.alex.sitecurriculo.controller;

import br.com.alex.sitecurriculo.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/sitecurriculo/certificado")
public class CertificadoController {

    @Autowired
    CertificadoService certificadoService;

    @GetMapping(value="/teste")
    public String teste(){
        return "Teste certificado Ok!";
    }

    @PostMapping(value = "/inclui")
    public void uploadCertificado(@RequestParam("file") MultipartFile file){
        certificadoService.salvarArquivo(file);
    }

}
