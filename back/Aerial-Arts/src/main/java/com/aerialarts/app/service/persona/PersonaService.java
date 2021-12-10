package com.aerialarts.app.service.persona;

import com.aerialarts.app.entitys.persona.PersonaEntity;

public interface PersonaService {
    void save (PersonaEntity persona);
    void findById (Integer id);
    PersonaEntity findOrderByDesc();
}
