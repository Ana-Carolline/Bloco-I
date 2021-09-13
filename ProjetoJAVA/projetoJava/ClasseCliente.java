package projetoJava;

import java.util.Scanner;

public class ClasseCliente {
	
	private String nome;
	private String  CPF;
	private String bairro;
	private boolean recorrente;
	private int idade;
	
	
	//SCANNER
	Scanner leia = new Scanner (System.in);
	
	//VARIÁVEIS
	private int frequencia;
	private int somaIdade;
	private int mediaIdade;
	private int entrada;
	private int contadorIdade;
	int x;
	int y;
	
	
	//SET E GET
	
	public int getFrequencia() {
		return frequencia;
	}
	
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	public int getSomaIdade() {
		return somaIdade;
	}
	public void setSomaIdade(int somaIdade) {
		this.somaIdade = somaIdade;
	}
	public int getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(int mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public int getEntrada() {
		return entrada;
	}
	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}
	public int getContadorIdade() {
		return contadorIdade;
	}
	public void setContadorIdade(int contadorIdade) {
		this.contadorIdade = contadorIdade;
	}

	public String getNome() {
			return nome;
		}
	public String getBairro() {
			return bairro;
		}
	public void setBairro(String bairro) {
			this.bairro = bairro;
		}
	public int getIdade() {
			return idade;
		}
	public void setIdade(int idade) {
			this.idade = idade;
		}
	public void setNome(String nome) {
			this.nome = nome;
		}
	public String getCPF() {
			return CPF;
		}
	public void setCPF(String cPF) {
			CPF = cPF;
		}
	public boolean isRecorrente() {
			return recorrente;
		}
	public void setRecorrente(boolean recorrente) {
			this.recorrente = recorrente;
		}
	
		
	
	// MÉTODOS PROCESSAMENTO
		
		public void infoCliente() {
			System.out.println("Olá! Você é o cliente número " + (y+1) + " de hoje. Faltam mais " + (2-y) + " entrada(s) para chegar a meta de hoje." );
			System.out.println("************************************************************************");
			System.out.println("Entre com seu nome");
			this.nome = leia.next();
			System.out.println(" ");
				do {
				
				System.out.println("Insira seu cpf:");
				this.CPF = leia.next();	
				}
				while (getCPF().length() != 11);
				
				System.out.println("Entre com sua idade");
				this.idade = leia.nextInt();
				
			System.out.println("Digite seu Bairro: ");
			this.bairro = leia.next();
			leia.next();
			System.out.println(" ");
			System.out.println("Quantas vezes você frequentou nossa comunidade?");
			frequencia = leia.nextInt();
			
			if( frequencia >= 5) {
				recorrente = true;
			}
			else{
				recorrente = false;
				}
			contadorIdade++;
			somaIdade = this.idade;
			
			//System.out.println("Muito obrigado! Atingimos a meta de hoje!");
			
		} 
	

}
