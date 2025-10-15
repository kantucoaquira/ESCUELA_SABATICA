package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.UsuarioDTO;
import pe.edu.upeu.sysasistencia.modelo.Usuario;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-13T17:38:17-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public List<UsuarioDTO> toDTOs(List<Usuario> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( entities.size() );
        for ( Usuario usuario : entities ) {
            list.add( toDTO( usuario ) );
        }

        return list;
    }

    @Override
    public List<Usuario> toEntities(List<UsuarioDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( dtos.size() );
        for ( UsuarioDTO usuarioDTO : dtos ) {
            list.add( toEntity( usuarioDTO ) );
        }

        return list;
    }

    @Override
    public UsuarioDTO toDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setIdUsuario( usuario.getIdUsuario() );
        usuarioDTO.setUser( usuario.getUser() );
        usuarioDTO.setEstado( usuario.getEstado() );

        return usuarioDTO;
    }

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.idUsuario( dto.getIdUsuario() );
        usuario.user( dto.getUser() );
        usuario.estado( dto.getEstado() );

        return usuario.build();
    }

    @Override
    public Usuario toEntityFromCADTO(UsuarioDTO.UsuarioCrearDto usuarioCrearDto) {
        if ( usuarioCrearDto == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.user( usuarioCrearDto.user() );
        usuario.estado( usuarioCrearDto.estado() );

        return usuario.build();
    }
}
