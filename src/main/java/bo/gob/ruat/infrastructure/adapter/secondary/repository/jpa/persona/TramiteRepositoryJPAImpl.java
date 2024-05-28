package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.persona;

import bo.gob.ruat.application.port.secondary.persona.ITramiteRepository;
import bo.gob.ruat.domain.Entity.TramiteEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.TramiteJPA;
import bo.gob.ruat.infrastructure.converter.ITramiteJPAConverter;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TramiteRepositoryJPAImpl implements PanacheRepository<TramiteJPA>, ITramiteRepository{

    @Inject
    ITramiteJPAConverter iTramiteJPAConverter;

    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public void insertTramite(TramiteEntity pTramiteEntity) {
        TramiteJPA vTramiteJPA = iTramiteJPAConverter.toTramiteJPA(pTramiteEntity);        
        persist(vTramiteJPA);

        pTramiteEntity.setNumSec(vTramiteJPA.getNumSec());
    }


    
}
