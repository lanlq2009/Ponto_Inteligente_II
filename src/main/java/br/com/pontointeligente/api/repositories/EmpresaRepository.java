package br.com.pontointeligente.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository  extends JpaRepository<Empresa, Long>{
	
	
	@Transactional(readOnly=true)
	public Empresa findByCnpj(String cnpj);
	

}
