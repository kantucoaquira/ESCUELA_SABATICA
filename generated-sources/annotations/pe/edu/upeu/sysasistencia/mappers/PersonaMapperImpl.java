package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.PersonaDTO;
import pe.edu.upeu.sysasistencia.modelo.Persona;
import pe.edu.upeu.sysasistencia.modelo.Usuario;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-10T15:00:12-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class PersonaMapperImpl implements PersonaMapper {

    @Override
    public List<PersonaDTO> toDTOs(List<Persona> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PersonaDTO> list = new ArrayList<PersonaDTO>( entities.size() );
        for ( Persona persona : entities ) {
            list.add( toDTO( persona ) );
        }

        return list;
    }

    @Override
    public List<Persona> toEntities(List<PersonaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Persona> list = new ArrayList<Persona>( dtos.size() );
        for ( PersonaDTO personaDTO : dtos ) {
            list.add( toEntity( personaDTO ) );
        }

        return list;
    }

    @Override
    public PersonaDTO toDTO(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaDTO personaDTO = new PersonaDTO();

        personaDTO.setUsuarioId( personaUsuarioIdUsuario( persona ) );
        personaDTO.setIdPersona( persona.getIdPersona() );
        personaDTO.setCodigoEstudiante( persona.getCodigoEstudiante() );
        personaDTO.setNombreCompleto( persona.getNombreCompleto() );
        personaDTO.setDocumento( persona.getDocumento() );
        personaDTO.setCorreo( persona.getCorreo() );
        personaDTO.setCorreoInstitucional( persona.getCorreoInstitucional() );
        personaDTO.setCelular( persona.getCelular() );
        personaDTO.setPais( persona.getPais() );
        personaDTO.setFoto( persona.getFoto() );
        personaDTO.setReligion( persona.getReligion() );
        personaDTO.setFechaNacimiento( persona.getFechaNacimiento() );
        personaDTO.setTipoPersona( persona.getTipoPersona() );

        return personaDTO;
    }

    @Override
    public Persona toEntity(PersonaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Persona.PersonaBuilder persona = Persona.builder();

        persona.usuario( personaDTOToUsuario( dto ) );
        persona.idPersona( dto.getIdPersona() );
        persona.codigoEstudiante( dto.getCodigoEstudiante() );
        persona.nombreCompleto( dto.getNombreCompleto() );
        persona.documento( dto.getDocumento() );
        persona.correo( dto.getCorreo() );
        persona.correoInstitucional( dto.getCorreoInstitucional() );
        persona.celular( dto.getCelular() );
        persona.pais( dto.getPais() );
        persona.foto( dto.getFoto() );
        persona.religion( dto.getReligion() );
        persona.fechaNacimiento( dto.getFechaNacimiento() );
        persona.tipoPersona( dto.getTipoPersona() );

        return persona.build();
    }

    private Long personaUsuarioIdUsuario(Persona persona) {
        Usuario usuario = persona.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        return usuario.getIdUsuario();
    }

    protected Usuario personaDTOToUsuario(PersonaDTO personaDTO) {
        if ( personaDTO == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.idUsuario( personaDTO.getUsuarioId() );

        return usuario.build();
    }
}
