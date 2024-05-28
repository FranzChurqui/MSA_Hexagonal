package bo.gob.ruat.domain.Entity;

import java.time.LocalDateTime;

public class TramiteEntity {
    private Long numSec;
    private String codigoTramite;
    private String descripcionTramite;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado;

    public TramiteEntity() {
    }

    public Long getNumSec() {
        return this.numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public String getCodigoTramite() {
        return this.codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public String getDescripcionTramite() {
        return this.descripcionTramite;
    }

    public void setDescripcionTramite(String descripcionTramite) {
        this.descripcionTramite = descripcionTramite;
    }

    public LocalDateTime getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
