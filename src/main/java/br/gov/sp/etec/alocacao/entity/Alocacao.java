package br.gov.sp.etec.alocacao.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Alocacao {

	@Id
	private Long id;
	
	@OneToMany
	private Cliente cliente;
	
	@OneToMany
	private Carro carro;
	
	private Double valorAlocacao;
	
	private LocalDate dataInicioAlocacao;
	
	private LocalDate dataFimAlocacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Double getValorAlocacao() {
		return valorAlocacao;
	}

	public void setValorAlocacao(Double valorAlocacao) {
		this.valorAlocacao = valorAlocacao;
	}

	public LocalDate getDataInicioAlocacao() {
		return dataInicioAlocacao;
	}

	public void setDataInicioAlocacao(LocalDate dataInicioAlocacao) {
		this.dataInicioAlocacao = dataInicioAlocacao;
	}

	public LocalDate getDataFimAlocacao() {
		return dataFimAlocacao;
	}

	public void setDataFimAlocacao(LocalDate dataFimAlocacao) {
		this.dataFimAlocacao = dataFimAlocacao;
	}
	
	
}
