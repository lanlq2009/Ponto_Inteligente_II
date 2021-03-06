package br.com.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pontointeligente.api.entities.Funcionario;

@Transactional(readOnly=true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	  public Funcionario findByCpf(String cpf);
	  
	  public Funcionario findByEmail(String email);
	  
	  public Funcionario findByEmailOrCpf(String email, String cpf);
	   

}
