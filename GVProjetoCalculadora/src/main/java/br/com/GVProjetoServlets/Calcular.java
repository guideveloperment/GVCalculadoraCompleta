package br.com.GVProjetoServlets;

public class Calcular {

	private int valor1;
	private int valor2;
	
	Calcular(int v1, int v2){
		this.valor1 = v1;
		this.valor2 = v2;
	}
	
	public int somar() {
		return this.valor1 + this.valor2;
	}
	
	
	public int subtrair() {
		return this.valor1 - this.valor2;
	}
	
	public int multiplicar() {
		return this.valor1 * this.valor2;
	}
	
	public int divisao() {
		return this.valor1 / this.valor2;
	}
	
	public int numerosAosQuadrado() {
		return Math.abs(this.valor1) + Math.abs(this.valor2);
	}
}


