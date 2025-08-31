package br.com.senai.sustentavel.models.dtos;

import br.com.senai.sustentavel.models.enums.CategoriaAcao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcaoSustentavelRequest {

    @NotBlank(message = "O título é obrigatório!")
    @Size(max = 255)
    private String titulo;

    @NotBlank(message = "Este campo é obrigatório o preenchimento!")
    @Size(max = 500)
    private String descricao;

    @NotNull
    private CategoriaAcao categoria;

    @NotNull
    @PastOrPresent
    private LocalDate dataRealizacao;

    @NotBlank
    private String responsavel;
}
