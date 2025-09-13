package com.br.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="certificadodigital")
public class CertificadoDigital {
	
	//Campo que irá gerar a identificação única do produto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Campo para inserir o nome do produto (tipo e modelo do certificado)
	@Column(name="nomeproduto")
	private String nomeProduto;

	//Campo para inserir a classificação de pessoa PF ou PJ
	@Column(name="tipopublico")
	private String tipoPublico;

	//Campo para inserir a data final da validade do certificado a ser comprado
	@Column(name="datavalidade")
	private Date dataValidade;

	//Campo para inserir o preço do produto
	@Column(name="preco")
	private double preco;

	//Campo para informar ao usuário se tem estoque disponível daquele item
	@Column(name="ativo")
	private boolean ativo;

	//Campo para informar a validade do produto em meses,(exemplo; produto com validade de 1 ano; "12 meses")
	@Column(name="validademeses")
	private int validadeMeses;
	
	
	
	//Construtor padrao, para a super Classe
	public CertificadoDigital() {
		super();
	}
	
	
		
	//Construtor com todos os campos
	public CertificadoDigital(Long id, String nomeProduto, String tipoPublico, Date dataValidade, double preco,boolean ativo, int validadeMeses) {
		super();
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.tipoPublico = tipoPublico;
		this.dataValidade = dataValidade;
		this.preco = preco;
		this.ativo = ativo;
		this.validadeMeses = validadeMeses;
	}
	
	
	//Gets and Sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoPublico() {
		return tipoPublico;
	}

	public void setTipoPublico(String tipoPublico) {
		this.tipoPublico = tipoPublico;
	}

	public Date getValidade() {
		return dataValidade;
	}

	public void setValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getValidadeMeses() {
		return validadeMeses;
	}

	public void setValidadeMeses(int validadeMeses) {
		this.validadeMeses = validadeMeses;
	}

}
