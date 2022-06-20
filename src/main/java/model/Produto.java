/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author biano
 */
public class Produto {

	private int id;
	private String nome;
	private double quantidadeEmEstoque;
	private double precoUnitario;

	public Produto() {}

	public Produto( int id, String nome, int quantidadeEmEstoque, double precoUnitario ) {
		this.id = id;
		this.nome = nome;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.precoUnitario = precoUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public double getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque( double quantidadeEmEstoque ) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario( double precoUnitario ) {
		this.precoUnitario = precoUnitario;
	}

	public void incrementaEstoque( double quantidade ) {
		this.quantidadeEmEstoque += quantidade;
	}

	public void decrementaEstoque( double quantidade ) {
		this.quantidadeEmEstoque -= quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", quantidadeEmEstoque=" + quantidadeEmEstoque + ", precoUnitario=" + precoUnitario + "]";
	}

}
