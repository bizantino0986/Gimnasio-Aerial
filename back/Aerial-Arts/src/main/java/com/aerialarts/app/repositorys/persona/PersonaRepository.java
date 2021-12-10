package com.aerialarts.app.repositorys.persona;

import com.aerialarts.app.entitys.AlumnoEntity;
import com.aerialarts.app.entitys.persona.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {
    PersonaEntity findFirstByOrderByIdDesc();
}
