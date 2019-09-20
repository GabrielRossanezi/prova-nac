package br.com.fiap.banco.repository;

import br.com.fiap.banco.bean.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaCorrenteRepository
        extends JpaRepository<ContaCorrente,Integer> {

}