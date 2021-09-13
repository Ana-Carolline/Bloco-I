package Polimorfismo;

public class finalAnimais {
	
	public static void main(String[] args)
	{
		cachorro coragem = new cachorro(1);
		cavalo estrela = new cavalo(2);
		preguica  anabanana = new preguica(3);
		
		coragem.nome();
		coragem.idade();
		System.out.println(" ");
		coragem.emiteSom();
		coragem.imprime();
		
		System.out.println("*******************************************************************************************");
		
		estrela.nome();
		estrela.idade();
		System.out.println(" ");
		estrela.emiteSom();
		estrela.print();
		
		System.out.println("*******************************************************************************************");
		
		anabanana.nome();
		anabanana.idade();
		anabanana.emiteSom();
		anabanana.printAll();
	}

}
