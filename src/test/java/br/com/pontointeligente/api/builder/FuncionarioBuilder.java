package br.com.pontointeligente.api.builder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.pontointeligente.api.entities.Empresa;
import br.com.pontointeligente.api.entities.Funcionario;
import br.com.pontointeligente.api.entities.Lancamento;
import br.com.pontointeligente.api.enuns.PerfilEnum;

public class FuncionarioBuilder {
	
	 private Long id;
	 
	 private String nome;
	 
	 private String email;
	 
	 private String senha;
	
	 private String cpf;
	
	 private BigDecimal valorHora;
	
	 private Float qtdHorasTrabalhoDia;
	
	 private Float qtdHorasAlmoco;
	
	 private PerfilEnum perfil;
	
	 private Date dataCriacao;
	
	 private Date dataAtualizacao;
	
	 private Empresa empresa;
	
	 private List<Lancamento> lancamentos;
	 
	 
	 public FuncionarioBuilder comId(Long id) {
		 this.id = id;
		 return this;
	 }
	 
	 public FuncionarioBuilder comNome(String nome) {
		 this.nome = nome;
		 return this;
	 }
	 
	 public FuncionarioBuilder comEmail(String email) {
		 this.email = email;
		 return this;
	 }
	 
	 public FuncionarioBuilder comCpf(String cpf) {
		 this.cpf = cpf;
		 return this;
	 }
	 
	 public FuncionarioBuilder comValorHora(BigDecimal valorHora) {
		 this.valorHora = valorHora;
		 return this;
	 }
	 
	 public FuncionarioBuilder comQtdHorasTrabalhoDia(Float qtdHorasTrabalhoDia) {
		 this.qtdHorasTrabalhoDia = qtdHorasTrabalhoDia;
		 return this;
	 }
	 
	 public FuncionarioBuilder comQtdHorasAlmoco(Float qtdHorasAlmoco) {
		 this.qtdHorasAlmoco = qtdHorasAlmoco;
		 return this;
	 }
	 	 
	 public FuncionarioBuilder comPerfil(PerfilEnum perfil) {
		 this.perfil = perfil;
		 return this;
	 }
	 	 
	 public FuncionarioBuilder comDataCriacao(Date dataCriacao) {
		 this.dataCriacao = dataCriacao;
		 return this;
	 }
	 	 
	 public FuncionarioBuilder comDataAtualizacao(Date dataAtualizacao) {
		 this.dataAtualizacao = dataAtualizacao;
		 return this;
	 }
	 	 
	 public FuncionarioBuilder comEmpresa(Empresa empresa) {
		 this.empresa = empresa;
		 return this;
	 }
	 
	 public FuncionarioBuilder comLancamentos(List<Lancamento> lancamentos) {
		 this.lancamentos = lancamentos;
		 return this;
	 }
	 
	 private Funcionario criar() {
		 Funcionario funcionario = new Funcionario();
		 funcionario.setId(this.id);
		 funcionario.setCpf(this.cpf);
		 funcionario.setDataAtualizacao(this.dataAtualizacao);
		 funcionario.setDataCriacao(this.dataCriacao);
		 funcionario.setEmail(this.email);
		 funcionario.setEmpresa(this.empresa);
		 funcionario.setLancamentos(this.lancamentos);
         funcionario.setNome(this.nome);
         funcionario.setPerfil(this.perfil);
         funcionario.setQtdHorasAlmoco(this.qtdHorasAlmoco);
         funcionario.setQtdHorasTrabalhoDia(this.qtdHorasTrabalhoDia);
         funcionario.setSenha(this.senha);
         funcionario.setValorHora(this.valorHora);
		 return funcionario;
	 }
	 
	 public Funcionario build() {
		 return this.criar();
	 }
	 

}
