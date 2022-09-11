package br.com.alex.sitecurriculo.model.dto;

public class ErroValidacaoRequestDto {

    private String campo;
    private String erro;

    public ErroValidacaoRequestDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
