package carro;

public class Estado {

	
		int potencia; // Atributos 
		int velocidade;
		String nome;

	void  acelerar() { //Métodos {
	velocidade = velocidade + potencia;
	}

	void frear() {
		
		 velocidade = velocidade/2;
	}
		
		int getVelocidade() {
			return velocidade;
		
		}
		
		void imprimir() {
			System.out.println("O carro " + nome + " está a velocidade de " + getVelocidade() + "KM/H");		}
	


	}


