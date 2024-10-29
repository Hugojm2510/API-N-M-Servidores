package com.vedruna.api_n_m.persistance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vedruna.api_n_m.dto.TrophieDTO;
import com.vedruna.api_n_m.persistance.models.Player;
import com.vedruna.api_n_m.persistance.models.Trophie;
import com.vedruna.api_n_m.persistance.repository.TrophieRepository;

public class TrophieServiceImpI implements TrophieServiceI{
    
    @Autowired
    TrophieRepository tRepo;

    @Autowired
    PlayerServiceI playerMngmnt;

    @Override
    public List<TrophieDTO> getAllTrophies(){
        List<Trophie> trophies = tRepo.findAll();
        List<TrophieDTO> trophieDTOs = new ArrayList<>();

        for (Trophie trophie : trophies){
            TrophieDTO trophieDTO = new TrophieDTO();
            trophieDTO.setIdTrophie(trophie.getIdTrophie());
            trophieDTO.setTitle(trophie.getTitle());
            trophieDTO.setDescription(trophie.getDescription());

            trophieDTOs.add(trophieDTO);
        }

        return trophieDTOs;
    }

    public void insertTrophie(TrophieDTO trophie){
        Trophie nuevoTrophie = new Trophie();
        nuevoTrophie.setIdTrophie(trophie.getIdTrophie());
        nuevoTrophie.setTitle(trophie.getTitle());
        nuevoTrophie.setDescription(trophie.getDescription());
    }

    @Override
    public List<TrophieDTO> getTrophieByTitle(String title){
        List<Trophie> trophieList = tRepo.findTrophieByTitle(title);
        List<TrophieDTO> trophieDTOList = new ArrayList<>();

        for (Trophie trophie : trophieList) {
            trophieDTOList.add(new TrophieDTO(trophie));
        }

        return trophieDTOList;
    }

    @Override
    public void saveTrophie(TrophieDTO trophie){
        tRepo.save(trophie);
    }

    @Override
    public void updateTrophie(Long idTrophie, TrophieDTO trophie){
        trophie.setIdTrophie(idTrophie);
        tRepo.save(trophie);
    }

    @Override
    public void deleteTrophie(Long idTrophie){
        tRepo.deleteById(idTrophie);
    }
}
