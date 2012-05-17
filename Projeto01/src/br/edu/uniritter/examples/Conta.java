package br.edu.uniritter.examples;

/* 
1. Crie uma classe Java que seja fiel ao diagrama UML ao lado e que seja
coerente aos conceitos dos nomes dos métodos.

Conta
int numero;
float saldo;
void deposita(float quantia);
void saca(float quantia);
float verificaSaldo();
int retornaNumeroConta();

2. Crie dois objetos do tipo Conta (instâncias) no BlueJ e simule
transações de depósito, saque e verificação de saldo. Lembre-se que
não se pode sacar um valor maior que o saldo existente!

3. Crie um construtor para a classe Conta com um parâmetro que será
guardado como o seu número.

 */
public class Conta {
	

	private int numero;
	
	private float saldo;
	
	public void deposita(float quantia){
		this.saldo += quantia;
	}
	
	public void saca(float quantia){
		this.saldo -= quantia;
	}
	
	public float verificaSaldo(){
		return this.saldo;
	}
	
	public int retornaNumeroConta(){
		return this.numero;
	}

	public Conta(int numero) {
		super();
		this.numero = numero;
	}
}
