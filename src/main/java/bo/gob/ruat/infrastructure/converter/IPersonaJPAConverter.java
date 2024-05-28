package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.PersonaJPA;

@Mapper (componentModel = "jakarta")
public interface IPersonaJPAConverter {

    @Mapping (target = "estado", constant = "AC" )
    PersonaJPA tPersonaJPA (PersonaEntity pPersonaEntity);
    
}
