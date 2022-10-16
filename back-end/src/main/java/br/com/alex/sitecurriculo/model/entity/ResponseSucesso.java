package br.com.alex.sitecurriculo.model.entity;

import java.util.List;

public class ResponseSucesso {

    private String mensagem;
    private List<String> mensagens;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }
}
