package bo.gob.ruat.infrastructure.adapter.primary.rest.persona;

import java.io.IOException;

import bo.gob.ruat.application.port.primary.persona.IPersonaUseCase;
import bo.gob.ruat.domain.Entity.PersonaBusquedaEntity;
import bo.gob.ruat.domain.Entity.PersonaEntity;
import bo.gob.ruat.domain.Entity.RegistroPersonaEntity;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.request.RegistroPersonaRequest;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response.PersonaResponse;
import bo.gob.ruat.infrastructure.adapter.primary.rest.persona.dto.response.RegistroPersonaResponse;
import bo.gob.ruat.infrastructure.converter.IPersonaEntityConverter;
import bo.gob.ruat.infrastructure.converter.IPersonaResponseConverter;
import bo.gob.ruat.infrastructure.converter.IRegistroPersonaResponseConverterImpl;
//import bo.gob.ruat.lib.core.domain.exception.ExcepcionLogica;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("personas/persona")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaRest {

    @Inject
    IPersonaUseCase iPersonaUseCase;

    @Inject
    IPersonaResponseConverter iPersonaResponseConverter;
    
    @Inject
    IPersonaEntityConverter personaEntityConverter;

    @Inject
    IRegistroPersonaResponseConverterImpl iRegistroPersonaResponseConverter;

    @GET
    @Path("/consulta-pesona")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response buscarPersona(
            @QueryParam("identificador") Long pIndentificador){   

        PersonaBusquedaEntity vUsuarioBusquedaEntity = iPersonaUseCase.buscarPersona(pIndentificador);
        PersonaResponse vPersonaResponse = iPersonaResponseConverter.toPersonaResponse(vUsuarioBusquedaEntity);

        return Response.ok(vPersonaResponse).build();

    }

    @POST
    @Path("/registrar-pesona")
    @Transactional(value = Transactional.TxType.REQUIRES_NEW, rollbackOn = {IOException.class, Exception.class, RuntimeException.class})
    public Response registrarPersona(
        @Valid RegistroPersonaRequest pRegistroPersonaRequest)
        {

            // PersonaEntity vPersonaEntity = new PersonaEntity();
            // vPersonaEntity.setNombre(pRegistroPersonaRequest.getNombre());
            
            PersonaEntity vPersonaEntity = personaEntityConverter.toPersonaEntity2(pRegistroPersonaRequest);

            System.out.println("Nombre: "+vPersonaEntity.getNombre() );
            System.out.println("Primer Apellido: "+vPersonaEntity.getPrimerApellido());
            System.out.println("Segundo Apellido: "+vPersonaEntity.getSegundoApellido());
            System.out.println("Correo Electrónico: "+vPersonaEntity.getCorreoElectronico());
            System.out.println("Celular: "+vPersonaEntity.getCelular());
            System.out.println("Fecha Nacimiento: "+vPersonaEntity.getFechaNacimiento());



            RegistroPersonaEntity vRegistroPersonaEntity =  iPersonaUseCase.registroPersona(vPersonaEntity);

            RegistroPersonaResponse vRegistroPersonaResponse = iRegistroPersonaResponseConverter.toRegistroPersonaResponse(vRegistroPersonaEntity);
            //vRegistroPersonaResponse.setIdentificadorPersona(vRegistroPersonaEntity.getNumSecPersona());
            //vRegistroPersonaResponse.setTramite(vRegistroPersonaEntity.getNumSecTramite());
            return Response.ok(vRegistroPersonaResponse).build();
        }
}
