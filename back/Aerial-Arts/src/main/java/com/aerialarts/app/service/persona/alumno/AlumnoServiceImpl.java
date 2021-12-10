package com.aerialarts.app.service.persona.alumno;

import com.aerialarts.app.entitys.AlumnoEntity;
import com.aerialarts.app.entitys.direccion.ColoniaEntity;
import com.aerialarts.app.entitys.direccion.DireccionEntity;
import com.aerialarts.app.entitys.direccion.EstadoEntity;
import com.aerialarts.app.entitys.direccion.LocalidadEntity;
import com.aerialarts.app.entitys.persona.CategoriaEntity;
import com.aerialarts.app.entitys.persona.EstatusPersonaEntity;
import com.aerialarts.app.entitys.persona.GeneroEntity;
import com.aerialarts.app.entitys.persona.PersonaEntity;
import com.aerialarts.app.repositorys.persona.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    private AlumnoRepository repository;

    @Autowired
    public AlumnoServiceImpl(AlumnoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AlumnoEntity> findAll() {
        return (List<AlumnoEntity>) repository.findAll();
    }

    @Override
    public void save(AlumnoEntity alumno) {

        Date fechaNacimiento = new Date(alumno.getPersona().getFecha_nacimiento().getTime());
        Date fechaInscripcion = new Date(alumno.getFecha_inscripcion().getTime());

        if (alumno.getPersona().getCorreo_electronico() == null) {
            alumno.getPersona().setCorreo_electronico("");
        }

        if (alumno.getPersona().getTelefono() == null) {
            alumno.getPersona().setTelefono("");
        }

        repository.nuevoAlumno(alumno.getPersona().getPrimer_nombre(), alumno.getPersona().getSegundo_nombre(),
                alumno.getPersona().getApellido_paterno(), alumno.getPersona().getApellido_materno(), fechaNacimiento,
                alumno.getPersona().getCategoria().getCategoria(), alumno.getPersona().getEstatusPersona().getEstatus(),
                alumno.getPersona().getGenero().getGenero(), fechaInscripcion, alumno.getPersona().getDireccion().getCalle(),
                alumno.getPersona().getDireccion().getNum_interior(), alumno.getPersona().getDireccion().getNum_exterior(),
                alumno.getPersona().getDireccion().getCodigo_postal(), alumno.getPersona().getDireccion().getColonia().getNombre(),
                alumno.getPersona().getDireccion().getColonia().getLocalidad().getEstado().getNombre(),
                alumno.getPersona().getDireccion().getColonia().getLocalidad().getNombre(), alumno.getPersona().getTelefono(),
                alumno.getPersona().getCorreo_electronico());
    }

    @Override
    public void update(AlumnoEntity alumno) {
        System.out.println("Service: " + alumno.toString());
        repository.save(alumno);
    }

    @Override
    public AlumnoEntity findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<AlumnoEntity> findByEstatus(String estatus) {
        return repository.findByPersonaEstatusPersonaEstatus(estatus);
    }

    @Override
    public void actualizarAlumno(AlumnoEntity alumno) {

        Date fechaNacimiento = new Date(alumno.getPersona().getFecha_nacimiento().getTime());
        Date fechaInscripcion = new Date(alumno.getFecha_inscripcion().getTime());

        if (alumno.getPersona().getDireccion().getNum_interior() == null) {
            alumno.getPersona().getDireccion().setNum_interior("");
        }

        repository.actualizarAlumno(alumno.getPersona().getPrimer_nombre(), alumno.getPersona().getSegundo_nombre(),
                alumno.getPersona().getApellido_paterno(), alumno.getPersona().getApellido_materno(), fechaNacimiento,
                alumno.getPersona().getCategoria().getCategoria(), alumno.getPersona().getEstatusPersona().getEstatus(),
                alumno.getPersona().getGenero().getGenero(), alumno.getPersona().getDireccion().getCalle(),
                alumno.getPersona().getDireccion().getNum_interior(), alumno.getPersona().getDireccion().getNum_exterior(),
                alumno.getPersona().getDireccion().getCodigo_postal(), alumno.getPersona().getDireccion().getColonia().getNombre(),
                alumno.getPersona().getDireccion().getColonia().getLocalidad().getEstado().getNombre(),
                alumno.getPersona().getDireccion().getColonia().getLocalidad().getNombre(), alumno.getPersona().getTelefono(),
                alumno.getPersona().getCorreo_electronico(), alumno.getPersona().getId()
                );
    }

    @Override
    public void eliminarAlumno(Integer idAlumno) {
        repository.eliminarAlumno(idAlumno);
    }


}
