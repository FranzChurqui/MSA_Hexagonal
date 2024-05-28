package bo.gob.ruat.infrastructure.adapter.secondary.model.jpa;

import java.util.Date;
import java.time.LocalDate;
import java.util.Collection;

import io.quarkus.agroal.DataSource;
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
//@DataSource("contribuyentes") 
@Table(name = "personas", schema = "hexagonal_schema", catalog = "hexagonal")
public class PersonaJPA extends PanacheEntityBase{
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_sec")
	@SequenceGenerator(name = "persona_sec", schema = "hexagonal_schema", sequenceName = "persona_sec", initialValue = 1000, allocationSize = 1)
	@Id
	@Column(name = "num_sec", nullable = false)
	private Long numSec; 

	@Column(name = "nombre", nullable = true, length = 50)
	private String nombre;

	@Column(name = "primer_apellido", nullable = true, length = 50)
	private String primerApellido;

	@Column(name = "segundo_apellido", nullable = true, length = 50)
	private String segundoApellido;

	@Column(name = "genero", nullable = true, length = 2)
	private String genero;    

	@Column(name = "fecha_nacimiento", nullable = true)
	private LocalDate fechaNacimiento;    

	@Column(name = "celular", nullable = true, length = 8)
	private String celular;       

	@Column(name = "correo_electronico", nullable = true, length = 50)
	private String correoElectronico;           

	@Column(name = "estado", nullable = false, length = 2)
	private String estado; 
    
	@OneToMany(mappedBy = "personaByNumSecPersona")
	private Collection<TramitePersonaJPA> tramitePersonaByNumSec;      


    public Long getNumSec() {
        return this.numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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


    public PersonaJPA() {
    }

    public PersonaJPA(Long numSec, String nombre, String primerApellido, String segundoApellido, String genero, LocalDate fechaNacimiento, String celular, String correoElectronico, String estado, Collection<TramitePersonaJPA> tramitePersonaByNumSec) {
        this.numSec = numSec;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
        this.tramitePersonaByNumSec = tramitePersonaByNumSec;
    }

    public PersonaJPA numSec(Long numSec) {
        setNumSec(numSec);
        return this;
    }

    public PersonaJPA nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public PersonaJPA primerApellido(String primerApellido) {
        setPrimerApellido(primerApellido);
        return this;
    }

    public PersonaJPA segundoApellido(String segundoApellido) {
        setSegundoApellido(segundoApellido);
        return this;
    }

    public PersonaJPA genero(String genero) {
        setGenero(genero);
        return this;
    }

    public PersonaJPA fechaNacimiento(LocalDate fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    public PersonaJPA celular(String celular) {
        setCelular(celular);
        return this;
    }

    public PersonaJPA correoElectronico(String correoElectronico) {
        setCorreoElectronico(correoElectronico);
        return this;
    }

    public PersonaJPA estado(String estado) {
        setEstado(estado);
        return this;
    }

    public PersonaJPA tramitePersonaByNumSec(Collection<TramitePersonaJPA> tramitePersonaByNumSec) {
        setTramitePersonaByNumSec(tramitePersonaByNumSec);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonaJPA)) {
            return false;
        }
        PersonaJPA personaJPA = (PersonaJPA) o;
        return Objects.equals(numSec, personaJPA.numSec) && Objects.equals(nombre, personaJPA.nombre) && Objects.equals(primerApellido, personaJPA.primerApellido) && Objects.equals(segundoApellido, personaJPA.segundoApellido) && Objects.equals(genero, personaJPA.genero) && Objects.equals(fechaNacimiento, personaJPA.fechaNacimiento) && Objects.equals(celular, personaJPA.celular) && Objects.equals(correoElectronico, personaJPA.correoElectronico) && Objects.equals(estado, personaJPA.estado) && Objects.equals(tramitePersonaByNumSec, personaJPA.tramitePersonaByNumSec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSec, nombre, primerApellido, segundoApellido, genero, fechaNacimiento, celular, correoElectronico, estado, tramitePersonaByNumSec);
    }

    @Override
    public String toString() {
        return "{" +
            " numSec='" + getNumSec() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", primerApellido='" + getPrimerApellido() + "'" +
            ", segundoApellido='" + getSegundoApellido() + "'" +
            ", genero='" + getGenero() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            ", celular='" + getCelular() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", estado='" + getEstado() + "'" +
            ", tramitePersonaByNumSec='" + getTramitePersonaByNumSec() + "'" +
            "}";
    }

}
