package br.com.pontointeligente.api.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.pontointeligente.api.builder.EmpresaBuilder;
import br.com.pontointeligente.api.entities.Empresa;
import br.com.pontointeligente.api.repositories.EmpresaRepository;

@SpringBootTest
@ActiveProfiles("test") 
public class EmpresaRepositoryTest {
	
	@Autowired
	public EmpresaRepository empresaRepository;
	
	
	private static final String CNPJ = "52999306000105";
	
	@Before(value="")
	public void setUp() {
		Empresa empresa = new EmpresaBuilder().comCnpj(CNPJ).comRazaoSocial("Empresa Teste S.A.").build();
		this.empresaRepository.save(empresa);
	}
	
	
	@After(value="")
	public void setOff() {
		this.empresaRepository.deleteAll();
	}
	
	
	@Test
	public void pesquisarEmpresaPorCnpjTest() {
		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);
		assertEquals(CNPJ, empresa.getCnpj());
	}
	
	

}
