package com.reservasDeAmbientes.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AmbienteDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotBlank(message = "O campo nome deverá ser preenchido")
    private String nome;

    @NotBlank(message = "O campo descrição deverá ser preenchido")
    private String descricao;

    @NotBlank(message = "O campo localização deverá ser preenchido")
    private String localizacao;

    @NotNull(message = "O campo capa0cidade deverá ser preenchido")
    private int capacidade;

}

