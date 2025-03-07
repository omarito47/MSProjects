package esprit.tn.ms2foyer.mapper;

import esprit.tn.ms2foyer.entity.Foyer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tn.starter.mongoShared.dto.FoyerDTO;
import tn.starter.mongoShared.mappers.GenericMapper;
@Mapper(componentModel = "spring")
public interface FoyerMapper extends GenericMapper<FoyerDTO,Foyer> {
    @Mapping(target = "id", ignore = true) // Prevent overwriting the ID
    void updateEntityFromDto(FoyerDTO dto, @MappingTarget Foyer entity);
}
