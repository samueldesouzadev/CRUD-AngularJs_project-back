package com.cadastro.cliente.api.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private String cnpj;

    private Date dataCadastro;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato = new Contato();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cliente_equipamento",
            joinColumns = {@JoinColumn(name = "equipamento_id",
                    referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "cliente_id",
                    referencedColumnName = "id")}
    )
    private List<Equipamento> equipamento;

    public Long getId() {
        return id;
    }
}
