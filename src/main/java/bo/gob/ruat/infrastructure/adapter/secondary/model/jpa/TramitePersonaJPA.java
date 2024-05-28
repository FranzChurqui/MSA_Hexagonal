package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tramites_personas", schema = "hexagonal_schema", catalog = "hexagonal")
public class TramitePersonaJPA extends PanacheEntityBase{
    
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tramite_persona_sec")
	@SequenceGenerator(name = "tramite_persona_sec", schema = "hexagonal_schema", sequenceName = "tramite_persona_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec;    

	@Column(name = "nsec_tramite", nullable = true)
	private Long nsecTramite;

	@Column(name = "nsec_persona", nullable = true)
	private Long nsecPersona;

	@Column(name = "estado", nullable = false, length = 2)
	private String estado; 
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nsec_tramite", referencedColumnName = "num_sec", nullable = false, insertable = false, updatable = false)
	private TramiteJPA tramiteByNumSecTramite;   

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nsec_persona", referencedColumnName = "num_sec", nullable = false, insertable = false, updatable = false)
	private PersonaJPA personaByNumSecPersona; 
    

    public Long getNumSec() {
        return this.numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public Long getNsecTramite() {
        return this.nsecTramite;
    }

    public void setNsecTramite(Long nsecTramite) {
        this.nsecTramite = nsecTramite;
    }

    public Long getNsecPersona() {
        return this.nsecPersona;
    }

    public void setNsecPersona(Long nsecPersona) {
        this.nsecPersona = nsecPersona;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TramiteJPA getTramiteByNumSecTramite() {
        return this.tramiteByNumSecTramite;
    }

    public void setTramiteByNumSecTramite(TramiteJPA tramiteByNumSecTramite) {
        this.tramiteByNumSecTramite = tramiteByNumSecTramite;
    }

    public PersonaJPA getPersonaByNumSecPersona() {
        return this.personaByNumSecPersona;
    }

    public void setPersonaByNumSecPersona(PersonaJPA personaByNumSecPersona) {
        this.personaByNumSecPersona = personaByNumSecPersona;
    }
    
    

    public TramitePersonaJPA() {
    }

    public TramitePersonaJPA(Long numSec, Long nsecTramite, Long nsecPersona, String estado, TramiteJPA tramiteByNumSecTramite, PersonaJPA personaByNumSecPersona) {
        this.numSec = numSec;
        this.nsecTramite = nsecTramite;
        this.nsecPersona = nsecPersona;
        this.estado = estado;
        this.tramiteByNumSecTramite = tramiteByNumSecTramite;
        this.personaByNumSecPersona = personaByNumSecPersona;
    }

    public TramitePersonaJPA numSec(Long numSec) {
        setNumSec(numSec);
        return this;
    }

    public TramitePersonaJPA nsecTramite(Long nsecTramite) {
        setNsecTramite(nsecTramite);
        return this;
    }

    public TramitePersonaJPA nsecPersona(Long nsecPersona) {
        setNsecPersona(nsecPersona);
        return this;
    }

    public TramitePersonaJPA estado(String estado) {
        setEstado(estado);
        return this;
    }

    public TramitePersonaJPA tramiteByNumSecTramite(TramiteJPA tramiteByNumSecTramite) {
        setTramiteByNumSecTramite(tramiteByNumSecTramite);
        return this;
    }

    public TramitePersonaJPA personaByNumSecPersona(PersonaJPA personaByNumSecPersona) {
        setPersonaByNumSecPersona(personaByNumSecPersona);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TramitePersonaJPA)) {
            return false;
        }
        TramitePersonaJPA tramitePersonaJPA = (TramitePersonaJPA) o;
        return Objects.equals(numSec, tramitePersonaJPA.numSec) && Objects.equals(nsecTramite, tramitePersonaJPA.nsecTramite) && Objects.equals(nsecPersona, tramitePersonaJPA.nsecPersona) && Objects.equals(estado, tramitePersonaJPA.estado) && Objects.equals(tramiteByNumSecTramite, tramitePersonaJPA.tramiteByNumSecTramite) && Objects.equals(personaByNumSecPersona, tramitePersonaJPA.personaByNumSecPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSec, nsecTramite, nsecPersona, estado, tramiteByNumSecTramite, personaByNumSecPersona);
    }

    @Override
    public String toString() {
        return "{" +
            " numSec='" + getNumSec() + "'" +
            ", nsecTramite='" + getNsecTramite() + "'" +
            ", nsecPersona='" + getNsecPersona() + "'" +
            ", estado='" + getEstado() + "'" +
            ", tramiteByNumSecTramite='" + getTramiteByNumSecTramite() + "'" +
            ", personaByNumSecPersona='" + getPersonaByNumSecPersona() + "'" +
            "}";
    }

}
