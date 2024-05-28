package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response.PersonaResponse;

@Mapper(componentModel = "jakarta")
public interface IPersonaResponseConverter {
    
    @Mapping(target= "tramite", source = "numTramite")
    @Mapping(target= "apellidoPaterno", source = "primerApellido")
    @Mapping(target= "apellidoMaterno", source = "segundoApellido")
    PersonaResponse toPersonaResponse(PersonaBusquedaEntity pBusquedaEntity);
}
