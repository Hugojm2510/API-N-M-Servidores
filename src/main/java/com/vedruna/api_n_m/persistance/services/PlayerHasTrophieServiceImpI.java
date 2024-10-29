package com.vedruna.api_n_m.persistance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vedruna.api_n_m.dto.PlayerHasTrophieDTO;
import com.vedruna.api_n_m.persistance.models.PlayerHasTrophie;
import com.vedruna.api_n_m.persistance.repository.PlayerHasTrophieRepository;

public class PlayerHasTrophieServiceImpI implements PlayerHasTrophieServiceI{

    @Autowired
    PlayerHasTrophieRepository phRepo;

    @Override
    public List<PlayerHasTrophieDTO> getAllPlayersTrophies(Long id) {
        List<PlayerHasTrophie> playerHasTrophies = phRepo.findPlayerById(id);
        List<PlayerHasTrophieDTO> playerHasTrophieDTOs = new ArrayList<>();

        for (PlayerHasTrophie playerHasTrophie : playerHasTrophies) {
            PlayerHasTrophieDTO dto = new PlayerHasTrophieDTO();
            dto.setPlayersIdPlayer(playerHasTrophie.getPlayersIdPlayer());
            dto.setTrophiesIdTrophie(playerHasTrophie.getTrophiesIdTrophie());
            playerHasTrophieDTOs.add(dto);
        }

        return playerHasTrophieDTOs;
    }

}
