package com.siape.stage.demande;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DemandeConfig {


    @Bean
    CommandLineRunner commandLineRunner(DemandeRepository repository){

        return args -> {
  /*         Demande d1 = new Demande(12254687L,"med","berouis","med.berouis@gmail.com","lien.com","creation d'un site web");
           Demande d2 = new Demande(12253687L,"med","berouis","med.berouis@gmail.com","lien.com","creation d'un site web");
           repository.saveAll(List.of(d1,d2));*/

        };
    }





}
