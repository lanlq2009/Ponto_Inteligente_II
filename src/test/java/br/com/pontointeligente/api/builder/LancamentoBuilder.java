package br.com.pontointeligente.api.builder;

import java.util.Date;

import br.com.pontointeligente.api.entities.Funcionario;
import br.com.pontointeligente.api.entities.Lancamento;
import br.com.pontointeligente.api.enuns.TipoEnum;

public class LancamentoBuilder {
	
	private Long id;
	
	private Date data;
	
	private String descricao;
	
	private String localizacao;
	
	private Date dataCriacao;
	
	private Date dataAtualizacao;
	
	private TipoEnum tipo;
	
	private Funcionario funcionario;

	
	public LancamentoBuilder comId(Long id) {
		this.id = id;
		return this;
	}
	
	public LancamentoBuilder comData(Date data) {
		this.data = data;
		return this;
	}
	
	public LancamentoBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public LancamentoBuilder comLocalizacao(String localizacao){
		this.localizacao = localizacao;
		return this;
	}
		
	public LancamentoBuilder comDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
		return this;
	}
	
	public LancamentoBuilder comDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
		return this;
	}
	
	public LancamentoBuilder comTipo(TipoEnum tipo) {
		this.tipo = tipo;
		return this;
	}
	
	public LancamentoBuilder comFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
		return this;
	}
	
	private Lancamento criar() {
		Lancamento lancamento = new Lancamento();
		lancamento.setData(this.data);
		lancamento.setDataAtualizacao(this.dataAtualizacao);
		lancamento.setDataCriacao(this.dataCriacao);
		lancamento.setDescricao(this.descricao);
		lancamento.setFuncionario(this.funcionario);
		lancamento.setId(this.id);
		lancamento.setLocalizacao(this.localizacao);
		lancamento.setTipo(this.tipo);
		return lancamento;
	}
	
	
	public Lancamento build() {
		return this.criar();
	}
	
	
}
