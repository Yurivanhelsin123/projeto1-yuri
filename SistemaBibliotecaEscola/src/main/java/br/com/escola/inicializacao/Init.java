package br.com.escola.inicializacao;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.escola.entity.Alunos;
import br.com.escola.repository.AlunoRepository;


//import br.com.biblioteca.entity.Alunos;
//import br.com.biblioteca.entity.Disciplinas;
//import br.com.biblioteca.entity.Turmas;
//import br.com.biblioteca.repository.AlunoRepository;
//import br.com.biblioteca.repository.DisciplinaRepository;
//import br.com.biblioteca.repository.TurmaRepository;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{	
	
	@Autowired
	AlunoRepository alunorepo;

	
	
	//@Autowired
	//AvaliacaoNotaService avaliacaoService;
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		 Alunos a1= new Alunos();
		 a1.setNome("Keano Reeves");
		 
		 Alunos a2= new Alunos();
		 a2.setNome("Rachel weis");	
		 
		 Alunos a3= new Alunos();
		 a3.setNome("Jean Claude van Dame");	
		 
		 Alunos a4= new Alunos();
		 a4.setNome("Yuri Yokada de Azevedo");
					
		 Alunos a5= new Alunos();
		 a5.setNome("The Rock");			
		
		 Alunos a6= new Alunos();
		 a6.setNome("Samule wel Jackson");
		
		
		
		
		 
		 

			 
			 
			
		 
		alunorepo.saveAll(Arrays.asList(a1,a2,a3,a4,a5,a6));		 
		 
}


	
}

