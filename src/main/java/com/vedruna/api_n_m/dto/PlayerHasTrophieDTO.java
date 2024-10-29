package com.vedruna.api_n_m.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vedruna.api_n_m.persistance.models.Player;
import com.vedruna.api_n_m.persistance.models.PlayerHasTrophie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayerHasTrophieDTO {

    private Long playersIdPlayer;
    private Long trophiesIdTrophie;

    public PlayerHasTrophieDTO(PlayerHasTrophie playerHasTrophies){
        this.playersIdPlayer = playerHasTrophies.getPlayersIdPlayer();
        this.trophiesIdTrophie = playerHasTrophies.getTrophiesIdTrophie();
    }
}