package com.aerialarts.app.entitys.persona;

import com.aerialarts.app.entitys.direccion.DireccionEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String primer_nombre;
    private String segundo_nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private String correo_electronico;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    @ManyToOne
    @JoinColumn(name = "id_direccion_fk")
    private DireccionEntity direccion;

    @ManyToOne
    @JoinColumn(name = "id_categoria_fk")
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "id_estatus_fk")
    private EstatusPersonaEntity estatusPersona;

    @ManyToOne
    @JoinColumn(name = "id_genero_fk")
    private GeneroEntity genero;

    public PersonaEntity(String primer_nombre, String segundo_nombre, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, DireccionEntity direccion, CategoriaEntity categoria, EstatusPersonaEntity estatusPersona, GeneroEntity genero) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.categoria = categoria;
        this.estatusPersona = estatusPersona;
        this.genero = genero;
    }

    public PersonaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public DireccionEntity getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionEntity direccion) {
        this.direccion = direccion;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public EstatusPersonaEntity getEstatusPersona() {
        return estatusPersona;
    }

    public void setEstatusPersona(EstatusPersonaEntity estatusPersona) {
        this.estatusPersona = estatusPersona;
    }

    public GeneroEntity getGenero() {
        return genero;
    }

    public void setGenero(GeneroEntity genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PersonaEntity{" +
                "id=" + id +
                ", primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo_electronico='" + correo_electronico + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", direccion=" + direccion +
                ", categoria=" + categoria +
                ", estatusPersona=" + estatusPersona +
                ", genero=" + genero +
                '}';
    }
}
