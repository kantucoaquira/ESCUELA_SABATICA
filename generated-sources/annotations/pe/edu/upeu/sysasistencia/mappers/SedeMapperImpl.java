package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.SedeDTO;
import pe.edu.upeu.sysasistencia.modelo.Sede;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-10T15:00:12-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class SedeMapperImpl implements SedeMapper {

    @Override
    public SedeDTO toDTO(Sede entity) {
        if ( entity == null ) {
            return null;
        }

        SedeDTO sedeDTO = new SedeDTO();

        sedeDTO.setIdSede( entity.getIdSede() );
        sedeDTO.setNombre( entity.getNombre() );
        sedeDTO.setDescripcion( entity.getDescripcion() );

        return sedeDTO;
    }

    @Override
    public Sede toEntity(SedeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sede.SedeBuilder sede = Sede.builder();

        sede.idSede( dto.getIdSede() );
        sede.nombre( dto.getNombre() );
        sede.descripcion( dto.getDescripcion() );

        return sede.build();
    }

    @Override
    public List<SedeDTO> toDTOs(List<Sede> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SedeDTO> list = new ArrayList<SedeDTO>( entities.size() );
        for ( Sede sede : entities ) {
            list.add( toDTO( sede ) );
        }

        return list;
    }

    @Override
    public List<Sede> toEntities(List<SedeDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Sede> list = new ArrayList<Sede>( dtos.size() );
        for ( SedeDTO sedeDTO : dtos ) {
            list.add( toEntity( sedeDTO ) );
        }

        return list;
    }
}
