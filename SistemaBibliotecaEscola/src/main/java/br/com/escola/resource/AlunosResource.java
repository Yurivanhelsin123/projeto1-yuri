package br.com.escola.resource;

import java.net.URI;
import java.util.List;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ImportResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.escola.entity.Alunos;
import br.com.escola.service.AlunoService;





	@RestController
	@RequestMapping("/alunos")
	public class AlunosResource {


		@Autowired
		private AlunoService alunoService;
		@RequestMapping(method=RequestMethod.GET)
		
		public ResponseEntity<List<Alunos>> ListarAluno(){
		List<Alunos> alunos	=alunoService.ListarTodosAlunos();
			return ResponseEntity.ok().body(alunos);
			
		}
		
		
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public ResponseEntity<Alunos>  buscaPorID(@PathVariable Integer id) throws ObjectNotFoundException{
			Alunos aluno = alunoService.buscaPorID(id);
			return ResponseEntity.ok().body(aluno);
		}
		
		
		
		
		
		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<Void> inserir(@RequestBody Alunos objAluno){
			Alunos aluno = alunoService.salvar(objAluno);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getId()).toUri();
			return ResponseEntity.created(uri).build();
		}
		
		@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> excluir(@PathVariable Integer id){
			alunoService.excluir(id);
			return ResponseEntity.noContent().build();
			
		}
		@RequestMapping(value="/{id}" , method = RequestMethod.PUT)
		public ResponseEntity<Void> alterar(@RequestBody Alunos  objAluno,@PathVariable Integer id){
			objAluno.setId(id);
			alunoService.alterar(objAluno);
			return ResponseEntity.noContent().build();
		}
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
