package com.vedruna.api_n_m.persistance.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "players_has_trophies")
public class PlayerHasTrophie implements Serializable{
    
    @EmbeddedId
    private PlayerHasTrophie id;

    @ManyToOne
    @JoinColumn(name = "players_idplayer")
    private Long playersIdPlayer;

    @ManyToOne
    @JoinColumn(name = "trophies_idtrophie")
    private Long trophiesIdTrophie;

}
