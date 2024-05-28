package bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response;

public class PersonaResponse {
    private Long tramite;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String denominacion;

    public PersonaResponse() {
    }


    public Long getTramite() {
        return this.tramite;
    }

    public void setTramite(Long tramite) {
        this.tramite = tramite;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }


}
