package tn.starter.shared.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.starter.shared.service.IGenericService;


import java.util.List;


public class GenericController<DTO,ID> {
    @Autowired
    IGenericService<DTO,ID> genericService;

    @PostMapping("/add")
    public DTO add(@RequestBody DTO dto) {
        return genericService.add(dto);
    }
    @PutMapping("/put")
    public DTO update(@RequestBody DTO dto) {
        return genericService.update(dto);
    }
    @GetMapping("/getById/{id}")
    public DTO retrieveById(@PathVariable("id") ID id) {
        return genericService.retrieveById(id);
    }
    @GetMapping("/getAll")
    public List<DTO> retrieveAll() {
        return genericService.retrieveAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") ID id) {
        genericService.delete(id);
    }
}