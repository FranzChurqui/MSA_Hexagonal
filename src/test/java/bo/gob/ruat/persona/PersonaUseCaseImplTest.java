package bo.gob.ruat.persona;

import bo.gob.ruat.application.port.primary.persona.IPersonaUseCase;
import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.RegistroPersonaEntity;
import bo.gob.ruat.domain.Entity.TramiteEntity;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class PersonaUseCaseImplTest {

    @Inject
    IPersonaUseCase iPersonaUseCase;


    @Test
    @Transactional
    public void buscarPersonaTest () {
        String nombreEsperado = "MARIA";
        Long id = 1000L;
        PersonaBusquedaEntity vPersonaBusquedaEntity = iPersonaUseCase.buscarPersona(id);
        assertEquals(nombreEsperado,vPersonaBusquedaEntity.getNombre());
    }
/*
    @Test
    @Transactional
    public void registroPersonaTest(){
            //RegistroPersonaEntity registroPersona(PersonaEntity pPersonaEntity) 
        PersonaEntity vDatosPersona = seteaDatosPersona();

        PersonaEntity seteaDatosPersona(){

            PersonaEntity vPersonaEntity = new PersonaEntity();

            vPersonaEntity.setNombre("FRANZ");
            vPersonaEntity.setPrimerApellido("CHURQUI");
            vPersonaEntity.setSegundoApellido("AGUIIRE");
            vPersonaEntity.setGenero("M");
            vPersonaEntity.setFechaNacimiento("02/05/2010");
            vPersonaEntity.setCelular("7815454");
            vPersonaEntity.setCorreoElectronico("franz@gmail.com");
            vPersonaEntity.setEstado("AC");
            return vTramiteEntity;
        }


       //vPersonaEntity.setNombre("Ramiro"); 

        RegistroPersonaEntity vRegistroPersonaEntity = iPersonaUseCase.registroPersona(null);
        assertNotNull(vRegistroPersonaEntity);
        


    }
 */

}
