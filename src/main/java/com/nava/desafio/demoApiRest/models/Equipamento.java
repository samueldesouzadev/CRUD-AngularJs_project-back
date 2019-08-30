package com.nava.desafio.demoApiRest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Equipamento implements Serializable {

    private static final long serialVersionUID = 5031103068367023255L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private Long ip;

    private Date dataDeCadastro;

    private Date dataDeDesativacao;

    @OneToOne(orphanRemoval = true)
    @Cascade(CascadeType.ALL)
    private Contato contato = new Contato();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Date getDataDeDesativacao() {
        return dataDeDesativacao;
    }

    public void setDataDeDesativacao(Date dataDeDesativacao) {
        this.dataDeDesativacao = dataDeDesativacao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
