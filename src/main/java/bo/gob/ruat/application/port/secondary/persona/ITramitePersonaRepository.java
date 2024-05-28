package bo.gob.ruat.application.port.secondary.persona;

import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.TramiteEntity;

public interface ITramitePersonaRepository {

    void  insertTramitePersona(TramiteEntity pTramiteEntity, PersonaEntity pPersonaEntity);
}
