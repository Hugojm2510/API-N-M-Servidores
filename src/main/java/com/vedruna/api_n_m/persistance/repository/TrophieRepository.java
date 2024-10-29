package com.vedruna.api_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.api_n_m.dto.PlayerDTO;
import com.vedruna.api_n_m.dto.TrophieDTO;
import com.vedruna.api_n_m.persistance.models.Trophie;

@Repository
public interface TrophieRepository extends JpaRepository<Trophie, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    List<Trophie> findTrophieByTitle(String title);
    void save(TrophieDTO trophie);
}
