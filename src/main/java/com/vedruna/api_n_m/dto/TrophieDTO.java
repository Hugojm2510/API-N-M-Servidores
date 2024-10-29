package com.vedruna.api_n_m.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vedruna.api_n_m.persistance.models.Trophie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrophieDTO {
    
    private Long idTrophie;
    private String title;
    private String description;

    public TrophieDTO(Trophie trophie){
        this.idTrophie = trophie.getIdTrophie();
        this.title = trophie.getTitle();
        this.description = trophie.getDescription();
    }
}
