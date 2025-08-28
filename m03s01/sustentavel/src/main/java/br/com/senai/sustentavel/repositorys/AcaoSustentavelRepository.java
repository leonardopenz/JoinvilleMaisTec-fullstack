package br.com.senai.sustentavel.repositorys;

import br.com.senai.sustentavel.models.entitys.Acaosustentavel;
import br.com.senai.sustentavel.models.enums.CategoriaAcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcaoSustentavelRepository extends JpaRepository<Acaosustentavel, Long> {
    List<Acaosustentavel> findByCategoria(CategoriaAcao categoria);
}
