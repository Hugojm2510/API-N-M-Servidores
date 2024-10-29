package com.vedruna.api_n_m.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vedruna.api_n_m.persistance.models.Player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayerDTO {
    
    private Long idPlayer;
    private String username;
    private TrophieDTO trophie;

    public PlayerDTO(Player player){
        this.idPlayer = player.getIdPlayer();
        this.username = player.getUsername();
    }
}
