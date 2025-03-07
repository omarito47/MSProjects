package esprit.tn.ms1etudiant.service;


import esprit.tn.ms1etudiant.entity.Etudiant;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.dto.FoyerDTO;
import tn.starter.shared.service.IGenericService;


public interface IEtudiantService extends IGenericService<EtudiantDTO, Long> {
    FoyerDTO getFoyerById(String id);
    Etudiant UpdateEtudiant(Etudiant e);

}

