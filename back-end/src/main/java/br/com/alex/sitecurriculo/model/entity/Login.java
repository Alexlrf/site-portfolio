package br.com.alex.sitecurriculo.model.entity;

import javax.persistence.*;

@Entity(name="tb_login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    public Long getIdLogin() {
        return idLogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
