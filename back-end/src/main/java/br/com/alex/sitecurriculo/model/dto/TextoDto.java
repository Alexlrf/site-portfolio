package br.com.alex.sitecurriculo.model.dto;

import javax.validation.constraints.NotBlank;
import br.com.alex.sitecurriculo.model.entity.Texto;

import java.time.LocalDate;

public class TextoDto {

    private Long idTexto;
    @NotBlank(message = "categoria não pode ser vazia")
    private String categoriaTexto;
    @NotBlank(message = "texto não pode ser vazia")
    private String texto;
    private LocalDate dataCriacao = LocalDate.now();

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
