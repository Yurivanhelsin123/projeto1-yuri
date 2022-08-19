package br.com.escola.service;

import java.util.List;
import java.util.Optional;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.escola.entity.Alunos;
import br.com.escola.repository.AlunoRepository;


@Service
public class AlunoService {
	@Autowired
	AlunoRepository alunoRepo;
	public List<Alunos>  ListarTodosAlunos(){
		return alunoRepo.findAll();
			}
	
	 
	
public Alunos buscaPorID(Integer id) throws ObjectNotFoundException{
	Optional<Alunos> aluno = alunoRepo.findById(id);
	return aluno.orElseThrow(() -> new ObjectNotFoundException(null, "Aluno não encontrado"));
	
	
}
	
	
	public Alunos salvar(Alunos aluno) {
		return alunoRepo.save(aluno);
	}
	
	
	public void excluir(Integer id) {
		alunoRepo.deleteById(id);
		
	}
	
	
	public Alunos alterar(Alunos objAluno) {		
		
		
		Alunos aluno = buscaPorID(objAluno.getId());
		
		aluno.setNome(objAluno.getNome());
		
		return salvar(aluno);
	}
	
	
	
	
	
	
	

}
