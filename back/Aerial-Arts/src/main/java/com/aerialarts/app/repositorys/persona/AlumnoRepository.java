package com.aerialarts.app.repositorys.persona;

import com.aerialarts.app.entitys.AlumnoEntity;
import com.aerialarts.app.entitys.persona.EstatusPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Integer> {
    List<AlumnoEntity> findByPersonaEstatusPersonaEstatus(String estatus);
    @Procedure(name = "nuevoAlumno")
    void nuevoAlumno(@Param("primerNomAct") String primerNom, @Param("segundoNomAct") String segundoNom,
                     @Param("apePaAct") String apellidPaterno, @Param("apeMaAct") String apellidoMaterno,
                     @Param("fechaNamAct") Date fechaNacimiento, @Param("categoriaAct") String categoria,
                     @Param("estatusAct") String estatus, @Param("generoAct") String genero,
                     @Param("fechaInscripcionAct") Date fechaInscripcion, @Param("calleAct") String calle,
                     @Param("numIntAct") String numeroInterior, @Param("numExtAct") String numeroExterior,
                     @Param("cpAct") String CodigoPostal, @Param("coloniaAct") String colonia,
                     @Param("estadoAct") String estado, @Param("localidadAct") String localidad,
                     @Param("telefonoAct") String telefono, @Param("correoAct") String correoElectronico);

    @Procedure(name = "actualizarAlumno")
    void actualizarAlumno(@Param("primerNomAct") String primerNom, @Param("segundoNomAct") String segundoNom,
                     @Param("apePaAct") String apellidPaterno, @Param("apeMaAct") String apellidoMaterno,
                     @Param("fechaNamAct") Date fechaNacimiento, @Param("categoriaAct") String categoria,
                     @Param("estatusAct") String estatus, @Param("generoAct") String genero,
                     @Param("calleAct") String calle, @Param("numIntAct") String numeroInterior,
                     @Param("numExtAct") String numeroExterior, @Param("cpAct") String CodigoPostal,
                     @Param("coloniaAct") String colonia, @Param("estadoAct") String estado,
                     @Param("localidadAct") String localidad, @Param("telefonoAct") String telefono,
                     @Param("correoAct") String correoElectronico, @Param("idPersonaAct") Integer idPersona);

    @Procedure(name = "eliminarAlumno")
    void eliminarAlumno (@Param("idPersonaAct") Integer idPersona);
}
