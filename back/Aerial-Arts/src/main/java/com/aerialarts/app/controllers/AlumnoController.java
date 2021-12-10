package com.aerialarts.app.controllers;

import com.aerialarts.app.entitys.AlumnoEntity;
import com.aerialarts.app.entitys.persona.PersonaEntity;
import com.aerialarts.app.service.persona.PersonaService;
import com.aerialarts.app.service.persona.alumno.AlumnoService;
import org.apache.tomcat.jni.Local;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private AlumnoService service;
    private PersonaService personaService;
    @Autowired
    public AlumnoController(AlumnoService service, PersonaService personaService) {
        this.service = service;
        this.personaService = personaService;
    }

    @GetMapping()
    public List<AlumnoEntity> listarAlumnos() {
        return service.findByEstatus("Activo");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void guardarAlumno(@RequestBody AlumnoEntity alumno) {
        ZoneId zoneId = ZoneId.systemDefault();
        alumno.setFecha_inscripcion(Date.from(LocalDate.now().atStartOfDay(zoneId).toInstant()));
        System.out.println(alumno.toString());
        //alumno = service.verificarAlumno(alumno);
        service.save(alumno);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarAlumno (@RequestBody AlumnoEntity alumno) {
        System.out.println(alumno.toString());
        service.actualizarAlumno(alumno);
    }

    @DeleteMapping(path = {"/{id}"})
    public void eliminarAlumno (@PathVariable("id") Integer alumno) {
        System.out.println("Entro aqui");
        System.out.println(alumno.toString());
        service.eliminarAlumno(alumno);
    }
}
