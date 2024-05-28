package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.RegistroPersonaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response.RegistroPersonaResponse;

@Mapper(componentModel = "jakarta")
public interface IRegistroPersonaResponseConverter {

    @Mapping(target= "tramite", source = "numSecTramite")
    @Mapping(target= "identificadorPersona", source = "numSecPersona")    
    RegistroPersonaResponse toRegistroPersonaResponse(RegistroPersonaEntity pRegistroPersonaEntity );

}

