package com.aerialarts.app.entitys.persona;


import javax.persistence.*;

@Entity
@Table(name = "persona_estatus")
public class EstatusPersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String estatus;

    public EstatusPersonaEntity(String estatus) {
        this.estatus = estatus;
    }

    public EstatusPersonaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
