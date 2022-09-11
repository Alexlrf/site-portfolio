package br.com.alex.sitecurriculo.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "tb_texto")
public class Texto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTexto;
    @Column(name = "categoria_texto", nullable = false)
    private String categoriaTexto;
    @Column(name = "texto", nullable = false, columnDefinition = "text")
    private String texto;
    @Column(name = "data_criacao", nullable = false)
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
