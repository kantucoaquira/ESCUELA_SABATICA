package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.ProgramaEstudioDTO;
import pe.edu.upeu.sysasistencia.modelo.Facultad;
import pe.edu.upeu.sysasistencia.modelo.ProgramaEstudio;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-13T17:38:16-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class ProgramaEstudioMapperImpl implements ProgramaEstudioMapper {

    @Override
    public List<ProgramaEstudioDTO> toDTOs(List<ProgramaEstudio> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProgramaEstudioDTO> list = new ArrayList<ProgramaEstudioDTO>( entities.size() );
        for ( ProgramaEstudio programaEstudio : entities ) {
            list.add( toDTO( programaEstudio ) );
        }

        return list;
    }

    @Override
    public List<ProgramaEstudio> toEntities(List<ProgramaEstudioDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ProgramaEstudio> list = new ArrayList<ProgramaEstudio>( dtos.size() );
        for ( ProgramaEstudioDTO programaEstudioDTO : dtos ) {
            list.add( toEntity( programaEstudioDTO ) );
        }

        return list;
    }

    @Override
    public ProgramaEstudioDTO toDTO(ProgramaEstudio programa) {
        if ( programa == null ) {
            return null;
        }

        ProgramaEstudioDTO programaEstudioDTO = new ProgramaEstudioDTO();

        programaEstudioDTO.setFacultadId( programaFacultadIdFacultad( programa ) );
        programaEstudioDTO.setFacultadNombre( programaFacultadNombre( programa ) );
        programaEstudioDTO.setIdPrograma( programa.getIdPrograma() );
        programaEstudioDTO.setNombre( programa.getNombre() );
        programaEstudioDTO.setDescripcion( programa.getDescripcion() );

        return programaEstudioDTO;
    }

    @Override
    public ProgramaEstudio toEntity(ProgramaEstudioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProgramaEstudio.ProgramaEstudioBuilder programaEstudio = ProgramaEstudio.builder();

        programaEstudio.facultad( programaEstudioDTOToFacultad( dto ) );
        programaEstudio.idPrograma( dto.getIdPrograma() );
        programaEstudio.nombre( dto.getNombre() );
        programaEstudio.descripcion( dto.getDescripcion() );

        return programaEstudio.build();
    }

    private Long programaFacultadIdFacultad(ProgramaEstudio programaEstudio) {
        Facultad facultad = programaEstudio.getFacultad();
        if ( facultad == null ) {
            return null;
        }
        return facultad.getIdFacultad();
    }

    private String programaFacultadNombre(ProgramaEstudio programaEstudio) {
        Facultad facultad = programaEstudio.getFacultad();
        if ( facultad == null ) {
            return null;
        }
        return facultad.getNombre();
    }

    protected Facultad programaEstudioDTOToFacultad(ProgramaEstudioDTO programaEstudioDTO) {
        if ( programaEstudioDTO == null ) {
            return null;
        }

        Facultad.FacultadBuilder facultad = Facultad.builder();

        facultad.idFacultad( programaEstudioDTO.getFacultadId() );

        return facultad.build();
    }
}
