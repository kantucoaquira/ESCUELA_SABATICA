package pe.edu.upeu.sysasistencia.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysasistencia.dtos.MatriculaDTO;
import pe.edu.upeu.sysasistencia.modelo.Facultad;
import pe.edu.upeu.sysasistencia.modelo.Matricula;
import pe.edu.upeu.sysasistencia.modelo.Persona;
import pe.edu.upeu.sysasistencia.modelo.ProgramaEstudio;
import pe.edu.upeu.sysasistencia.modelo.Sede;
import pe.edu.upeu.sysasistencia.modelo.TipoPersona;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-10T15:00:12-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class MatriculaMapperImpl implements MatriculaMapper {

    @Override
    public List<MatriculaDTO> toDTOs(List<Matricula> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MatriculaDTO> list = new ArrayList<MatriculaDTO>( entities.size() );
        for ( Matricula matricula : entities ) {
            list.add( toDTO( matricula ) );
        }

        return list;
    }

    @Override
    public List<Matricula> toEntities(List<MatriculaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Matricula> list = new ArrayList<Matricula>( dtos.size() );
        for ( MatriculaDTO matriculaDTO : dtos ) {
            list.add( toEntity( matriculaDTO ) );
        }

        return list;
    }

    @Override
    public MatriculaDTO toDTO(Matricula matricula) {
        if ( matricula == null ) {
            return null;
        }

        MatriculaDTO matriculaDTO = new MatriculaDTO();

        matriculaDTO.setPersonaId( matriculaPersonaIdPersona( matricula ) );
        matriculaDTO.setNombreCompleto( matriculaPersonaNombreCompleto( matricula ) );
        matriculaDTO.setCodigoEstudiante( matriculaPersonaCodigoEstudiante( matricula ) );
        matriculaDTO.setDocumento( matriculaPersonaDocumento( matricula ) );
        matriculaDTO.setTipoPersona( matriculaPersonaTipoPersona( matricula ) );
        matriculaDTO.setSedeId( matriculaSedeIdSede( matricula ) );
        matriculaDTO.setSedeName( matriculaSedeNombre( matricula ) );
        matriculaDTO.setFacultadId( matriculaFacultadIdFacultad( matricula ) );
        matriculaDTO.setFacultadName( matriculaFacultadNombre( matricula ) );
        matriculaDTO.setProgramaId( matriculaProgramaEstudioIdPrograma( matricula ) );
        matriculaDTO.setProgramaName( matriculaProgramaEstudioNombre( matricula ) );
        matriculaDTO.setIdMatricula( matricula.getIdMatricula() );
        matriculaDTO.setModoContrato( matricula.getModoContrato() );
        matriculaDTO.setModalidadEstudio( matricula.getModalidadEstudio() );
        matriculaDTO.setCiclo( matricula.getCiclo() );
        matriculaDTO.setGrupo( matricula.getGrupo() );
        matriculaDTO.setFechaMatricula( matricula.getFechaMatricula() );
        matriculaDTO.setEstado( matricula.getEstado() );

        return matriculaDTO;
    }

    @Override
    public Matricula toEntity(MatriculaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Matricula.MatriculaBuilder matricula = Matricula.builder();

        matricula.persona( matriculaDTOToPersona( dto ) );
        matricula.sede( matriculaDTOToSede( dto ) );
        matricula.facultad( matriculaDTOToFacultad( dto ) );
        matricula.programaEstudio( matriculaDTOToProgramaEstudio( dto ) );
        matricula.idMatricula( dto.getIdMatricula() );
        matricula.modoContrato( dto.getModoContrato() );
        matricula.modalidadEstudio( dto.getModalidadEstudio() );
        matricula.ciclo( dto.getCiclo() );
        matricula.grupo( dto.getGrupo() );
        matricula.fechaMatricula( dto.getFechaMatricula() );
        matricula.estado( dto.getEstado() );

        return matricula.build();
    }

    private Long matriculaPersonaIdPersona(Matricula matricula) {
        Persona persona = matricula.getPersona();
        if ( persona == null ) {
            return null;
        }
        return persona.getIdPersona();
    }

    private String matriculaPersonaNombreCompleto(Matricula matricula) {
        Persona persona = matricula.getPersona();
        if ( persona == null ) {
            return null;
        }
        return persona.getNombreCompleto();
    }

    private String matriculaPersonaCodigoEstudiante(Matricula matricula) {
        Persona persona = matricula.getPersona();
        if ( persona == null ) {
            return null;
        }
        return persona.getCodigoEstudiante();
    }

    private String matriculaPersonaDocumento(Matricula matricula) {
        Persona persona = matricula.getPersona();
        if ( persona == null ) {
            return null;
        }
        return persona.getDocumento();
    }

    private TipoPersona matriculaPersonaTipoPersona(Matricula matricula) {
        Persona persona = matricula.getPersona();
        if ( persona == null ) {
            return null;
        }
        return persona.getTipoPersona();
    }

    private Long matriculaSedeIdSede(Matricula matricula) {
        Sede sede = matricula.getSede();
        if ( sede == null ) {
            return null;
        }
        return sede.getIdSede();
    }

    private String matriculaSedeNombre(Matricula matricula) {
        Sede sede = matricula.getSede();
        if ( sede == null ) {
            return null;
        }
        return sede.getNombre();
    }

    private Long matriculaFacultadIdFacultad(Matricula matricula) {
        Facultad facultad = matricula.getFacultad();
        if ( facultad == null ) {
            return null;
        }
        return facultad.getIdFacultad();
    }

    private String matriculaFacultadNombre(Matricula matricula) {
        Facultad facultad = matricula.getFacultad();
        if ( facultad == null ) {
            return null;
        }
        return facultad.getNombre();
    }

    private Long matriculaProgramaEstudioIdPrograma(Matricula matricula) {
        ProgramaEstudio programaEstudio = matricula.getProgramaEstudio();
        if ( programaEstudio == null ) {
            return null;
        }
        return programaEstudio.getIdPrograma();
    }

    private String matriculaProgramaEstudioNombre(Matricula matricula) {
        ProgramaEstudio programaEstudio = matricula.getProgramaEstudio();
        if ( programaEstudio == null ) {
            return null;
        }
        return programaEstudio.getNombre();
    }

    protected Persona matriculaDTOToPersona(MatriculaDTO matriculaDTO) {
        if ( matriculaDTO == null ) {
            return null;
        }

        Persona.PersonaBuilder persona = Persona.builder();

        persona.idPersona( matriculaDTO.getPersonaId() );

        return persona.build();
    }

    protected Sede matriculaDTOToSede(MatriculaDTO matriculaDTO) {
        if ( matriculaDTO == null ) {
            return null;
        }

        Sede.SedeBuilder sede = Sede.builder();

        sede.idSede( matriculaDTO.getSedeId() );

        return sede.build();
    }

    protected Facultad matriculaDTOToFacultad(MatriculaDTO matriculaDTO) {
        if ( matriculaDTO == null ) {
            return null;
        }

        Facultad.FacultadBuilder facultad = Facultad.builder();

        facultad.idFacultad( matriculaDTO.getFacultadId() );

        return facultad.build();
    }

    protected ProgramaEstudio matriculaDTOToProgramaEstudio(MatriculaDTO matriculaDTO) {
        if ( matriculaDTO == null ) {
            return null;
        }

        ProgramaEstudio.ProgramaEstudioBuilder programaEstudio = ProgramaEstudio.builder();

        programaEstudio.idPrograma( matriculaDTO.getProgramaId() );

        return programaEstudio.build();
    }
}
