package esprit.tn.ms1etudiant.service;

import esprit.tn.ms1etudiant.entity.Etudiant;
import esprit.tn.ms1etudiant.feignClient.FoyerClient;
import esprit.tn.ms1etudiant.repository.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.dto.FoyerDTO;
import tn.starter.shared.service.IGenericServiceImpl;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl extends IGenericServiceImpl<EtudiantDTO,Etudiant,Long> implements  IEtudiantService{
    private final FoyerClient foyerClient;
    private final EtudiantRepository etudiantRepository;

    @Override
    public FoyerDTO getFoyerById(String id) {
        return foyerClient.findById(id);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
}
