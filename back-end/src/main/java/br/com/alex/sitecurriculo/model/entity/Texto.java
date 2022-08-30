package br.com.alex.literabyte.model.entity;

import br.com.alex.literabyte.model.dto.TextoDto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "tb_texto")
public class Texto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTexto;

    @Column(name = "categoria_texto")
    private String categoriaTexto;

    @Column(name = "texto")
    private String texto;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    public Texto(TextoDto textoDto) {
        this.idTexto = textoDto.getIdTexto();
        this.categoriaTexto = textoDto.getCategoriaTexto();
        this.texto = textoDto.getTexto();
        this.dataCriacao = textoDto.getDataCriacao();
    }

    public Texto() {
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
