package com.vedruna.api_n_m.persistance.services;

import java.util.List;

import com.vedruna.api_n_m.dto.PlayerDTO;
import com.vedruna.api_n_m.dto.TrophieDTO;
import com.vedruna.api_n_m.persistance.models.Player;

public interface TrophieServiceI {
    List<TrophieDTO> getAllTrophies();
    List<TrophieDTO> getTrophieByTitle(String title);
    void insertTrophie(TrophieDTO trophie);
    void saveTrophie(TrophieDTO trophie);
    void updateTrophie(Long idTrophie, TrophieDTO trophie);
    void deleteTrophie(Long idTrophie);
}
