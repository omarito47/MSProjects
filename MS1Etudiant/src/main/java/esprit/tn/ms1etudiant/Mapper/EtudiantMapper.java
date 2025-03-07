package esprit.tn.ms1etudiant.Mapper;

import esprit.tn.ms1etudiant.entity.Etudiant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.mapper.GenericMapper;
@Mapper(componentModel = "spring")

public interface EtudiantMapper extends GenericMapper<EtudiantDTO, Etudiant> {
    @Mapping(target = "id", ignore = true) // Prevent overwriting the ID
    void updateEntityFromDto(EtudiantDTO dto, @MappingTarget Etudiant entity);

}
