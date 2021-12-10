package com.aerialarts.app.service.persona;

import com.aerialarts.app.entitys.persona.PersonaEntity;
import com.aerialarts.app.repositorys.persona.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaRepository repository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PersonaEntity persona) {

    }

    @Override
    public void findById(Integer id) {

    }

    @Override
    public PersonaEntity findOrderByDesc() {
        return repository.findFirstByOrderByIdDesc();
    }
}
