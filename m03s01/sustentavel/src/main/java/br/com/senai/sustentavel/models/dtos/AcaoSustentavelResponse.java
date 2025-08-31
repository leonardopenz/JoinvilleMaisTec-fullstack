package br.com.senai.sustentavel.models.dtos;

import br.com.senai.sustentavel.models.enums.CategoriaAcao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcaoSustentavelResponse {
    private Long id;
    private String titulo;
    private String descricao;
    private CategoriaAcao categoria;
    private LocalDate dataRealizacao;
    private String responsavel;
}
