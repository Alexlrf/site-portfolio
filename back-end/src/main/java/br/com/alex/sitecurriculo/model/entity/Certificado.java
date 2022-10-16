package br.com.alex.sitecurriculo.model.entity;

import java.io.File;

public class Certificado {

    private String nome;
    private String conteudo;
    private Object imagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Object getImagem() {
        return imagem;
    }

    public void setImagem(Object imagem) {
        this.imagem = imagem;
    }
}
