package br.com.db1.controller;

public class Calculadora {
	private Integer resultado;
	
	Calculadora calculadora = new Calculadora();
	
	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2; 
	}
	
	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2; 
	}
	
	public Double dividir(Double valor1, Double valor2) {
		return (valor1 / valor2); 
	}
	
	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 / valor2; 
	}
}
