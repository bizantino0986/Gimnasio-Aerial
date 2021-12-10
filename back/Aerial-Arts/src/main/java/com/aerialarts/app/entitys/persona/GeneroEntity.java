package com.aerialarts.app.entitys.persona;

import javax.persistence.*;

@Entity
@Table(name = "genero")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String genero;

    public GeneroEntity(String genero) {
        this.genero = genero;
    }

    public GeneroEntity() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "GeneroEntity{" +
                "id=" + id +
                ", genero='" + genero + '\'' +
                '}';
    }
}
