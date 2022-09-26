package com.siape.stage.demande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/demandes")
public class DemandeController {

    private final DemandeService demandeService ;
    @Autowired
    public DemandeController(DemandeService demandeService) {
        this.demandeService = demandeService;
    }

    @GetMapping
    public List<Demande> getDemandes(){

    return demandeService.getDemandes();


    }
    @PostMapping
    public void registerNewDemande(@RequestBody Demande demande){
        demandeService.addNewDemande(demande);
    }

}
