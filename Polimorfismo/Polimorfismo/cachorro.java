package Polimorfismo;

public class cachorro extends animais {

private int run;
	
	public cachorro(int run)
	{
		super("Cachorro");
		this.run = run;
	}
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public void imprime()
	{
		System.out.println("Cachorros saud�veis correm at� "+getRun()+" km/h...");
	}
	@Override
	public String nome() {
		System.out.println("Coragem");
		return "Coragem";
	}
	@Override
	public int idade() {
		System.out.print(4);
		return 4;
	}
	@Override
	public String emiteSom() {
		System.out.println("Coragem, saud�vel portanto emite sons ao ver motos..");
		return "Coragem, saud�vel portanto emite sons ao ver motos..";
	}
}
