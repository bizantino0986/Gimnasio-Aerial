package com.aerialarts.app.entitys.direccion;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public EstadoEntity() {
    }

    public EstadoEntity(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
