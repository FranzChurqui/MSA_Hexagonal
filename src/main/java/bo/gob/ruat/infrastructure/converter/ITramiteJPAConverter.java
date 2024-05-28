package bo.gob.ruat.infrastructure.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bo.gob.ruat.domain.Entity.TramiteEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.TramiteJPA;

@Mapper(componentModel = "jakarta")
public interface ITramiteJPAConverter {

    @Mapping(target = "estado", constant = "AC")
    TramiteJPA toTramiteJPA (TramiteEntity pTramiteEntity);
}
