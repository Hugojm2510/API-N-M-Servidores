package com.vedruna.api_n_m.persistance.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "players")
public class Player implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplayer", nullable = false)
    private Long idPlayer;

    @Column(name = "username", nullable = false)
    private String username;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<PlayerHasTrophie> playerHasTrophies;

}
