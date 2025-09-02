package br.com.senai.sustentavel.repositorys;

import br.com.senai.sustentavel.models.entitys.AcaoSustentavel;
import br.com.senai.sustentavel.models.enums.CategoriaAcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcaoSustentavelRepository extends JpaRepository<AcaoSustentavel, Long> {
    List<AcaoSustentavel> findByCategoria(CategoriaAcao categoria);
}
