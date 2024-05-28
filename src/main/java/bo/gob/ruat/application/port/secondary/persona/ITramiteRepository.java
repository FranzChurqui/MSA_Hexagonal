package bo.gob.ruat.application.port.secondary.persona;

import bo.gob.ruat.domain.Entity.TramiteEntity;

public interface ITramiteRepository {

    void insertTramite(TramiteEntity pTramiteEntity);
    
}
