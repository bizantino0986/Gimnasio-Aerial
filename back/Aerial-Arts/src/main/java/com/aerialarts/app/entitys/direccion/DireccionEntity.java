package com.aerialarts.app.entitys.direccion;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class DireccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String calle;
    private String num_interior;
    private String num_exterior;
    private String codigo_postal;

    @ManyToOne
    @JoinColumn(name = "id_colonia_fk")
    private ColoniaEntity colonia;

    public DireccionEntity(String calle, String num_interior, String num_exterior, String codigo_postal, ColoniaEntity colonia) {
        this.calle = calle;
        this.num_interior = num_interior;
        this.num_exterior = num_exterior;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
    }

    public DireccionEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNum_interior() {
        return num_interior;
    }

    public void setNum_interior(String num_interior) {
        this.num_interior = num_interior;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public ColoniaEntity getColonia() {
        return colonia;
    }

    public void setColonia(ColoniaEntity colonia) {
        this.colonia = colonia;
    }

    public String getNum_exterior() {
        return num_exterior;
    }

    public void setNum_exterior(String num_exterior) {
        this.num_exterior = num_exterior;
    }

    @Override
    public String toString() {
        return "DireccionEntity{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", num_interior='" + num_interior + '\'' +
                ", num_exterior='" + num_exterior + '\'' +
                ", codigo_postal='" + codigo_postal + '\'' +
                ", colonia=" + colonia +
                '}';
    }
}
