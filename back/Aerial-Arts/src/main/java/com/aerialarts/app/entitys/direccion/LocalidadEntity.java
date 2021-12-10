package com.aerialarts.app.entitys.direccion;

import javax.persistence.*;

@Entity
@Table(name = "localidad")
public class LocalidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_estado_fk")
    private EstadoEntity estado;

    public LocalidadEntity(String nombre, EstadoEntity estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public LocalidadEntity() {
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

    public EstadoEntity getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "LocalidadEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
