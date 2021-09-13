package projetoJava;

import java.util.Scanner;

public class ClasseMetal {

Scanner leia = new Scanner (System.in);
	
	private double pesometal;
	private double precometal;
	private double compensacaometal;
	
	
	
	public double getPesometal() {
		return pesometal;
	}
	public void setPesometal(double pesometal) {
		this.pesometal = pesometal;
	}
	public double getPrecometal() {
		return precometal;
	}
	public void setPrecometal(double precometal) {
		this.precometal = precometal;
	}
	public double getCompensacaometal() {
		return compensacaometal;
	}
	public void setCompensacaometal(double compensacaometal) {
		this.compensacaometal = compensacaometal;
	}
	
	public void compensacaoMetal() {
		
		System.out.println ("Digite a quantidade em Kg de metal trazido");
		int resposta = leia.nextInt();
		
		this.compensacaometal = resposta * 3.20;
	}
	
}
