package bo.gob.ruat.infrastructure.adapter.secondary.repository.jpa.persona;

import bo.gob.ruat.application.port.secondary.persona.ITramitePersonaRepository;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.TramiteEntity;
import bo.gob.ruat.domain.Entity.TramitePersonaEntity;
import bo.gob.ruat.infrastructure.adapter.secondary.model.jpa.TramitePersonaJPA;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TramitePersonaRepositoryJPAImpl implements PanacheRepository<TramitePersonaJPA>, ITramitePersonaRepository{


    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    public void insertTramitePersona(TramiteEntity pTramiteEntity, PersonaEntity pPersonaEntity) {
        TramitePersonaEntity vTramitePersonaEntity = new TramitePersonaEntity();
        TramitePersonaJPA vTramitePersonaJPA = new TramitePersonaJPA();
        vTramitePersonaJPA.setNsecTramite(pTramiteEntity.getNumSec());
        vTramitePersonaJPA.setNsecPersona(pPersonaEntity.getNumSec());
        vTramitePersonaJPA.setEstado("AC");
        persist(vTramitePersonaJPA);

    }



    
}
