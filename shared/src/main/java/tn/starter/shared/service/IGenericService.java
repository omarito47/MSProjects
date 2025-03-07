package tn.starter.shared.service;
import java.util.List;

public interface IGenericService<DTO,ID> {
    DTO add(DTO dto);
    DTO update(DTO dto);
    DTO retrieveById(ID id);
    List<DTO> retrieveAll();
    void delete(ID id);
}