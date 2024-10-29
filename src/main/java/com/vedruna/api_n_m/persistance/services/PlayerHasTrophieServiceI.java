package com.vedruna.api_n_m.persistance.services;

import java.util.List;

import com.vedruna.api_n_m.dto.PlayerHasTrophieDTO;

public interface PlayerHasTrophieServiceI {
    List<PlayerHasTrophieDTO> getAllPlayersTrophies(Long id);
}
