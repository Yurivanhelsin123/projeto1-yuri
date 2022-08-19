package br.com.escola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.escola.entity.Alunos;








@Repository
public interface AlunoRepository extends JpaRepository<Alunos, Integer> {

}


