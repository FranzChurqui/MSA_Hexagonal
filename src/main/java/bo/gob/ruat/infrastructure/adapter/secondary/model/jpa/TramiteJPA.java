package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tramites", schema = "hexagonal_schema", catalog = "hexagonal")
public class TramiteJPA extends PanacheEntityBase{

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tramite_sec")
	@SequenceGenerator(name = "tramite_sec", schema = "hexagonal_schema", sequenceName = "tramite_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec;    

	@Column(name = "codigo_tramite", nullable = true, length = 6)
	private String codigoTramite;

	@Column(name = "descripcion_tramite", nullable = true, length = 50)
	private String descripcionTramite;

	@Column(name = "fecha_inicio", nullable = true)
	private LocalDateTime fechaInicio;

	@Column(name = "fecha_fin", nullable = true)
	private LocalDateTime fechaFin;

	@Column(name = "estado", nullable = false, length = 2)
	private String estado;   
    
	@OneToMany(mappedBy = "tramiteByNumSecTramite")
	private Collection<TramitePersonaJPA> tramitePersonaByNumSec;     


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

    public Collection<TramitePersonaJPA> getTramitePersonaByNumSec() {
        return this.tramitePersonaByNumSec;
    }

    public void setTramitePersonaByNumSec(Collection<TramitePersonaJPA> tramitePersonaByNumSec) {
        this.tramitePersonaByNumSec = tramitePersonaByNumSec;
    }


    public TramiteJPA() {
    }

    public TramiteJPA(Long numSec, String codigoTramite, String descripcionTramite, LocalDateTime fechaInicio, LocalDateTime fechaFin, String estado, Collection<TramitePersonaJPA> tramitePersonaByNumSec) {
        this.numSec = numSec;
        this.codigoTramite = codigoTramite;
        this.descripcionTramite = descripcionTramite;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.tramitePersonaByNumSec = tramitePersonaByNumSec;
    }

    public TramiteJPA numSec(Long numSec) {
        setNumSec(numSec);
        return this;
    }

    public TramiteJPA codigoTramite(String codigoTramite) {
        setCodigoTramite(codigoTramite);
        return this;
    }

    public TramiteJPA descripcionTramite(String descripcionTramite) {
        setDescripcionTramite(descripcionTramite);
        return this;
    }

    public TramiteJPA fechaInicio(LocalDateTime fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }

    public TramiteJPA fechaFin(LocalDateTime fechaFin) {
        setFechaFin(fechaFin);
        return this;
    }

    public TramiteJPA estado(String estado) {
        setEstado(estado);
        return this;
    }

    public TramiteJPA tramitePersonaByNumSec(Collection<TramitePersonaJPA> tramitePersonaByNumSec) {
        setTramitePersonaByNumSec(tramitePersonaByNumSec);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TramiteJPA)) {
            return false;
        }
        TramiteJPA tramiteJPA = (TramiteJPA) o;
        return Objects.equals(numSec, tramiteJPA.numSec) && Objects.equals(codigoTramite, tramiteJPA.codigoTramite) && Objects.equals(descripcionTramite, tramiteJPA.descripcionTramite) && Objects.equals(fechaInicio, tramiteJPA.fechaInicio) && Objects.equals(fechaFin, tramiteJPA.fechaFin) && Objects.equals(estado, tramiteJPA.estado) && Objects.equals(tramitePersonaByNumSec, tramiteJPA.tramitePersonaByNumSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSec, codigoTramite, descripcionTramite, fechaInicio, fechaFin, estado, tramitePersonaByNumSec);
    }

    @Override
    public String toString() {
        return "{" +
            " numSec='" + getNumSec() + "'" +
            ", codigoTramite='" + getCodigoTramite() + "'" +
            ", descripcionTramite='" + getDescripcionTramite() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            ", fechaFin='" + getFechaFin() + "'" +
            ", estado='" + getEstado() + "'" +
            ", tramitePersonaByNumSec='" + getTramitePersonaByNumSec() + "'" +
            "}";
    }
    

}
