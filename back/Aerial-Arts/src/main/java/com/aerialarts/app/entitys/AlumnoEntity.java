package com.aerialarts.app.entitys;

import com.aerialarts.app.entitys.persona.PersonaEntity;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "alumno")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "nuevoAlumno",
                procedureName = "nuevoAlumno",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "primerNomAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "segundoNomAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "apePaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "apeMaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "fechaNamAct", type = java.sql.Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "categoriaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "estatusAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "generoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "fechaInscripcionAct", type = java.sql.Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "calleAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numIntAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numExtAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cpAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "coloniaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "estadoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "localidadAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "telefonoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "correoAct", type = String.class),
                }
        ),
        @NamedStoredProcedureQuery(
                name = "actualizarAlumno",
                procedureName = "updatePersona",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "primerNomAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "segundoNomAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "apePaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "apeMaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "fechaNamAct", type = java.sql.Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "categoriaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "estatusAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "generoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "calleAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numIntAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numExtAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cpAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "coloniaAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "estadoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "localidadAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "telefonoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "correoAct", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "idPersonaAct", type = Integer.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "eliminarAlumno",
                procedureName = "deactivatePersona",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "idPersonaAct", type = Integer.class)
                }
        )
})
public class AlumnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_inscripcion;

    @ManyToOne
    @JoinColumn(name = "id_persona_fk")
    private PersonaEntity persona;

    public AlumnoEntity(Date fecha_inscripcion, PersonaEntity persona) {
        this.fecha_inscripcion = fecha_inscripcion;
        this.persona = persona;
    }

    public AlumnoEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_nacimiento) {
        this.fecha_inscripcion = fecha_nacimiento;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "AlumnoEntity{" +
                "id=" + id +
                ", fecha_nacimiento=" + fecha_inscripcion +
                ", persona=" + persona +
                '}';
    }
}
