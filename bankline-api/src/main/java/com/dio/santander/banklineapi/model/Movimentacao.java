package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

public class Movimentacao {
private Double valor;
private String descricao;
private Integer id;
private LocalDateTime dataHora;
private MovimentacaoTipo tipo;
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public LocalDateTime getDataHora() {
	return dataHora;
}
public void setDataHora(LocalDateTime dataHora) {
	this.dataHora = dataHora;
}
public MovimentacaoTipo getTipo() {
	return tipo;
}
public void setTipo(MovimentacaoTipo tipo) {
	this.tipo = tipo;
}
}
