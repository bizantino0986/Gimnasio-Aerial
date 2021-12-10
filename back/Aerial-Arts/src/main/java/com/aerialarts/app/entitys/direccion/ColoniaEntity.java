package com.aerialarts.app.entitys.direccion;

import javax.persistence.*;

@Entity
@Table(name = "colonia")
public class ColoniaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_localidad_fk")
    private LocalidadEntity localidad;

    public ColoniaEntity() {
    }

    public ColoniaEntity(String nombre, LocalidadEntity localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
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

    public LocalidadEntity getLocalidad() {
        return localidad;
    }

    public void setLocalidad(LocalidadEntity localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "ColoniaEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad=" + localidad +
                '}';
    }
}
