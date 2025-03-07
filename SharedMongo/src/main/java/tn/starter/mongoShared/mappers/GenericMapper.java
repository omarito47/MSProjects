package tn.starter.mongoShared.mappers;

import java.util.List;

public interface GenericMapper<DTO,T> {
	/* DTO:DTO T:Entity */
	T toEntity(DTO source);
	DTO toDto(T source);
	List<DTO> toListDto(List<T> source);
	void updateEntityFromDto(DTO dto, T entity);
}