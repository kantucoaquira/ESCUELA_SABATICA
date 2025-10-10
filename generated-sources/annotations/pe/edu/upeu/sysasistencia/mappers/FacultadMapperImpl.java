package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.FacultadDTO;
import pe.edu.upeu.sysasistencia.modelo.Facultad;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-10T15:00:12-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class FacultadMapperImpl implements FacultadMapper {

    @Override
    public FacultadDTO toDTO(Facultad entity) {
        if ( entity == null ) {
            return null;
        }

        FacultadDTO facultadDTO = new FacultadDTO();

        facultadDTO.setIdFacultad( entity.getIdFacultad() );
        facultadDTO.setNombre( entity.getNombre() );
        facultadDTO.setDescripcion( entity.getDescripcion() );

        return facultadDTO;
    }

    @Override
    public Facultad toEntity(FacultadDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Facultad.FacultadBuilder facultad = Facultad.builder();

        facultad.idFacultad( dto.getIdFacultad() );
        facultad.nombre( dto.getNombre() );
        facultad.descripcion( dto.getDescripcion() );

        return facultad.build();
    }

    @Override
    public List<FacultadDTO> toDTOs(List<Facultad> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FacultadDTO> list = new ArrayList<FacultadDTO>( entities.size() );
        for ( Facultad facultad : entities ) {
            list.add( toDTO( facultad ) );
        }

        return list;
    }

    @Override
    public List<Facultad> toEntities(List<FacultadDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Facultad> list = new ArrayList<Facultad>( dtos.size() );
        for ( FacultadDTO facultadDTO : dtos ) {
            list.add( toEntity( facultadDTO ) );
        }

        return list;
    }
}
