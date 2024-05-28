package bo.gob.ruat.domain.Entity;

public class TramitePersonaEntity {
    private Long numSec;
    private Long nSecTramite;
    private Long nSecPersona;
    private String estado;
    

    public TramitePersonaEntity() {
    }

    public Long getNumSec() {
        return this.numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public Long getNSecTramite() {
        return this.nSecTramite;
    }

    public void setNSecTramite(Long nSecTramite) {
        this.nSecTramite = nSecTramite;
    }

    public Long getNSecPersona() {
        return this.nSecPersona;
    }

    public void setNSecPersona(Long nSecPersona) {
        this.nSecPersona = nSecPersona;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
