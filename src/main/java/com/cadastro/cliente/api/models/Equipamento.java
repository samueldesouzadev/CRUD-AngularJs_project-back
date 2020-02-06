package com.cadastro.cliente.api.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Data
public class Equipamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private Long ip;

    private Date dataCadastro;

    private Date dataDesativacao;

    @OneToOne(orphanRemoval = true)
    @Cascade(CascadeType.ALL)
    private Contato contato = new Contato();
}
