package com.siape.stage.demande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandeService
{
int x=999999999;
byte b = (byte) x ;





    private final DemandeRepository demandeRepository;

    @Autowired
    public DemandeService(DemandeRepository demandeRepository) {
        this.demandeRepository = demandeRepository;
    }

    public List<Demande> getDemandes(){

        return demandeRepository.findAll();




    }


    public void addNewDemande( Demande demande) {
        demandeRepository.save(demande);

    }

    public void deleteDemande(Long id) {
        demandeRepository.deleteById(id);
    }
}
