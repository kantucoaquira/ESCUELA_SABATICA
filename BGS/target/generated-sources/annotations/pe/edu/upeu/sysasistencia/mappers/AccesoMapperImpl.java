package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.AccesoDTO;
import pe.edu.upeu.sysasistencia.modelo.Acceso;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-13T17:38:16-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class AccesoMapperImpl implements AccesoMapper {

    @Override
    public AccesoDTO toDTO(Acceso entity) {
        if ( entity == null ) {
            return null;
        }

        AccesoDTO accesoDTO = new AccesoDTO();

        accesoDTO.setIdAcceso( entity.getIdAcceso() );
        accesoDTO.setNombre( entity.getNombre() );
        accesoDTO.setUrl( entity.getUrl() );
        accesoDTO.setIcono( entity.getIcono() );

        return accesoDTO;
    }

    @Override
    public Acceso toEntity(AccesoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Acceso.AccesoBuilder acceso = Acceso.builder();

        acceso.idAcceso( dto.getIdAcceso() );
        acceso.nombre( dto.getNombre() );
        acceso.url( dto.getUrl() );
        acceso.icono( dto.getIcono() );

        return acceso.build();
    }

    @Override
    public List<AccesoDTO> toDTOs(List<Acceso> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AccesoDTO> list = new ArrayList<AccesoDTO>( entities.size() );
        for ( Acceso acceso : entities ) {
            list.add( toDTO( acceso ) );
        }

        return list;
    }

    @Override
    public List<Acceso> toEntities(List<AccesoDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Acceso> list = new ArrayList<Acceso>( dtos.size() );
        for ( AccesoDTO accesoDTO : dtos ) {
            list.add( toEntity( accesoDTO ) );
        }

        return list;
    }
}
