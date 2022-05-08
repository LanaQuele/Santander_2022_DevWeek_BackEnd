package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tab_correntista" )


public class Correntista {
@Column(length = 60)	
private String nome;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(length = 20)
private String cpf;

@Embedded
private Conta conta;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCpg() {
	return cpf;
}
public void setCpg(String cpf) {
	this.cpf = cpf;
}
public Conta getConta() {
	return conta;
}
public void setConta(Conta conta) {
	this.conta = conta;
}
}
