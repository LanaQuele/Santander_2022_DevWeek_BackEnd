package com.dio.santander.banklineapi.model;

public class Correntista {
private String nome;
private Integer id;
private String cpg;
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
	return cpg;
}
public void setCpg(String cpg) {
	this.cpg = cpg;
}
public Conta getConta() {
	return conta;
}
public void setConta(Conta conta) {
	this.conta = conta;
}
}
