package com.vedruna.api_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.api_n_m.dto.PlayerDTO;
import com.vedruna.api_n_m.persistance.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    List<Player> findByUsername(String username);
    void save(PlayerDTO player);
}
