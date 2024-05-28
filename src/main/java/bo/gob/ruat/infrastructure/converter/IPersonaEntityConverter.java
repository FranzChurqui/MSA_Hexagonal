package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.request.RegistroPersonaRequest;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.PersonaJPA;

@Mapper(componentModel = "jakarta")
public interface IPersonaEntityConverter {
    PersonaEntity toPersonaEntity (PersonaJPA personaJPA);

    @Mapping(target = "primerApellido", source = "apellidoPaterno")
    @Mapping(target = "segundoApellido", source = "apellidoMaterno")
    PersonaEntity toPersonaEntity2 (RegistroPersonaRequest pRegistroPersonaRequest);
}
