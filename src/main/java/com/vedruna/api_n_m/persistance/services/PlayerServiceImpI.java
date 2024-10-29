package com.vedruna.api_n_m.persistance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vedruna.api_n_m.dto.PlayerDTO;
import com.vedruna.api_n_m.persistance.models.Player;
import com.vedruna.api_n_m.persistance.models.Trophie;
import com.vedruna.api_n_m.persistance.repository.PlayerRepository;
import com.vedruna.api_n_m.persistance.repository.TrophieRepository;

public class PlayerServiceImpI implements PlayerServiceI{
    
    @Autowired
    PlayerRepository pRepo;

    @Override
    public List<PlayerDTO> getAllPlayers(){
        List<Player> docList = pRepo.findAll();
        List<PlayerDTO> docListDTO = new ArrayList<PlayerDTO>();

        for (Player player : docList){
            docListDTO.add(new PlayerDTO(player));
        }

        return docListDTO;
    }

    @Override
    public List<PlayerDTO> getPlayerByUsername(String username){
        List<Player> players = pRepo.findByUsername(username);
        List<PlayerDTO> playerDTOList = new ArrayList<>();

        for (Player player : players){
            playerDTOList.add(new PlayerDTO(player));
        }

        return playerDTOList;
    }
    
    public Player getPlayerById(Long id){
        return pRepo.findById(id).orElse(null);
    }

    @Override
    public void insertPlayer(PlayerDTO player){
        Player nuevoPlayer = new Player();
        nuevoPlayer.setUsername(player.getUsername());
    }

    @Override
    public void savePlayer(PlayerDTO player){
        pRepo.save(player);
    }

    @Override
    public void updatePlayer(Long idPlayer, PlayerDTO player){
        pRepo.save(player);
    }

    @Override
    public void deletePlayer(Long idPlayer){
        pRepo.deleteById(idPlayer);
    }
}
