package bo.gob.ruat.application.port.primary.persona;

import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.RegistroPersonaEntity;
import bo.gob.ruat.domain.Entity.TramiteEntity;

public interface IPersonaUseCase {
    
    PersonaBusquedaEntity buscarPersona(Long pIdentificador);

    RegistroPersonaEntity registroPersona(PersonaEntity pPersonaEntity);
    
}
