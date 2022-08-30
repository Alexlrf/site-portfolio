package br.com.alex.literabyte.model.dto;

import br.com.alex.literabyte.model.entity.Texto;

import javax.persistence.Column;
import java.time.LocalDate;

public class TextoDto {

    private Long idTexto;
    private String categoriaTexto;
    private String texto;
    private LocalDate dataCriacao = LocalDate.now();

    public TextoDto(Texto texto) {
        this.idTexto = texto.getIdTexto();
        this.categoriaTexto = texto.getCategoriaTexto();
        this.texto = texto.getTexto();
        this.dataCriacao = texto.getDataCriacao();
    }

    public TextoDto() {
    }

    public Long getIdTexto() {
        return idTexto;
    }

    public void setIdTexto(Long idTexto) {
        this.idTexto = idTexto;
    }

    public String getCategoriaTexto() {
        return categoriaTexto;
    }

    public void setCategoriaTexto(String categoriaTexto) {
        this.categoriaTexto = categoriaTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
