package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.TramiteEntity;

@Mapper(componentModel = "jakarta")
public interface IPersonaBusquedaEntityConverter {

    PersonaBusquedaEntity toUsuarioBusquedaEntity(Long pIdentificador);

    @Mapping(target = "numTramite", source = "pTramiteEntity.numSec")
    PersonaBusquedaEntity toPersonaBusquedaEntity(PersonaEntity personaEntity, TramiteEntity pTramiteEntity);
    
}
