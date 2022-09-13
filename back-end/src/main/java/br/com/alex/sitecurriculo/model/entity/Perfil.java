package br.com.alex.sitecurriculo.model.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class Perfil implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Long idPerfil;

    @Column(name = "nome_perfil")
    private String nomePerfil;

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    @Override
    public String getAuthority() {
        return nomePerfil;
    }
}
