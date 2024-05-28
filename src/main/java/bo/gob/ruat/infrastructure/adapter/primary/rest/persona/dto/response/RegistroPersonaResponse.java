package bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response;

public class RegistroPersonaResponse {
    private Long tramite;
	private Long identificadorPersona;
    public RegistroPersonaResponse() {
    }
    public Long getTramite() {
        return tramite;
    }
    public void setTramite(Long tramite) {
        this.tramite = tramite;
    }
    public Long getIdentificadorPersona() {
        return identificadorPersona;
    }
    public void setIdentificadorPersona(Long identificadorPersona) {
        this.identificadorPersona = identificadorPersona;
    }
    
}
