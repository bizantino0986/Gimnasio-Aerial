package com.aerialarts.app.service.persona.alumno;

import com.aerialarts.app.entitys.AlumnoEntity;
import com.aerialarts.app.entitys.persona.EstatusPersonaEntity;

import java.util.List;

public interface AlumnoService {
    List<AlumnoEntity> findAll ();
    void save (AlumnoEntity alumno);
    void update (AlumnoEntity alumno);
    AlumnoEntity findById(Integer id);
    List<AlumnoEntity> findByEstatus(String estatus);
    void actualizarAlumno(AlumnoEntity alumno);
    void eliminarAlumno(Integer idAlumno);

}
