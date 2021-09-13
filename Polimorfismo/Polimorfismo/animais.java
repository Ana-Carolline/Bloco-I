package Polimorfismo;

abstract public class animais 
{
	private String especie;
	
	
	abstract public String nome();
	abstract public int idade();
	abstract public String emiteSom();
	
	
	public animais (String especie)
	{
		super();
		this.especie = especie;
		
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
