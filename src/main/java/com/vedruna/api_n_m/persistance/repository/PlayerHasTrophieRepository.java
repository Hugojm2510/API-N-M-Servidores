package com.vedruna.api_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.api_n_m.persistance.models.PlayerHasTrophie;

@Repository
public interface PlayerHasTrophieRepository extends JpaRepository<PlayerHasTrophieRepository, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    List<PlayerHasTrophie> findPlayerById(Long idPlayer);
    List<PlayerHasTrophie> findTrophieById(Long idTrophie);
}
