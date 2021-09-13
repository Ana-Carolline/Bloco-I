package Polimorfismo;

public class preguica extends animais {
	
private int escalada;
	
	public preguica(int escalada)
	{
		super("preguica");
		this.escalada = escalada;
	}
	public int getEscalada() {
		return escalada;
	}

	public void setSobeArvore(int escalada) {
		this.escalada = escalada;
	}
	@Override
	public String nome() {
		System.out.println("AnaBanana");
		return "AnaBanana";
	}
	@Override
	public int idade() {
		System.out.println(23);
		return 23;
	}
	@Override
	public String emiteSom() {
		System.out.println("AnaBanana emite sons afiando suas garras nas árvores para melhor escalar!!");
		return "AnaBanana emite sons afiando suas garras nas árvores para melhor escalar!!";
	}
	void printAll()
	{
		System.out.println("Roberto leva em média "+getEscalada()+" dias para subir em uma única árvore...");
	}

}
