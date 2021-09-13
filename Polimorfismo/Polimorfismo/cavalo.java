package Polimorfismo;

public class cavalo extends animais {
private int speed;
	
	public cavalo(int speed)
	{
		super("Cavalo");
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String nome() {
		System.out.println("Estrela");
		return "Estrela";
	}
	@Override
	public int idade() {
		System.out.print(15);
		return 15;
	}
	@Override
	public String emiteSom() 
	{
		System.out.println("Estrela relincha ao me ver!!");
		return "Estrela relincha ao me ver!!";
	}
	public void print()
	{
		System.out.println("Como Estrela � saud�vel pode correr at� "+getSpeed()+"  km/h no campo!!");
	}

}
