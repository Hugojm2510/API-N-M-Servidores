package com.vedruna.api_n_m.persistance.services;

import java.util.List;

import com.vedruna.api_n_m.dto.PlayerDTO;
import com.vedruna.api_n_m.persistance.models.Player;

public interface PlayerServiceI {
    List<PlayerDTO> getAllPlayers();
    List<PlayerDTO> getPlayerByUsername(String username);
    Player getPlayerById(Long idPlayer);
    void insertPlayer(PlayerDTO player);
    void savePlayer(PlayerDTO player);
    void updatePlayer(Long idPlayer, PlayerDTO player);
    void deletePlayer(Long idPlayer);
}
