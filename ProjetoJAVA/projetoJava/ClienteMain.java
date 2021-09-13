package projetoJava;

public class ClienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClasseCliente cliente = new ClasseCliente ();
		ClasseVidro vidro = new ClasseVidro();
		ClasseMetal metal = new ClasseMetal();
		ClassePapel papel = new ClassePapel();
		ClassePlastico plastico = new ClassePlastico();
		int contadorIdade= 0;
		int somaIdade = 0;
		double mediaidade, compensacao;
		int x=0;
		int y=0;
		int bonus;
		boolean condicaobonus= false;
		
		
		do {
			cliente.infoCliente();
			vidro.compensacaoVidro();
			papel.compensacaoPapel();
			plastico.compensacaoPlastico();
			metal.compensacaoMetal();
			
			if(vidro.getCompensacaovidro()>0 || papel.getCompensacaopapel()>0 
					|| plastico.getCompensacaoplastico()>0 || metal.getCompensacaometal()>0) {
				condicaobonus = true;
			}

		
		if(cliente.isRecorrente() == true && condicaobonus == true) 
		{
			bonus = 200;
			compensacao = (vidro.getCompensacaovidro()) + (papel.getCompensacaopapel()) + 
					(plastico.getCompensacaoplastico()) + (metal.getCompensacaometal()) + bonus;
 			
		}
		else 
		{
			bonus = 0;
			compensacao = (vidro.getCompensacaovidro()) + (papel.getCompensacaopapel()) + 
					(plastico.getCompensacaoplastico()) + (metal.getCompensacaometal());
 					}
		
		contadorIdade += cliente.getContadorIdade();
		somaIdade += cliente.getSomaIdade();
		mediaidade = somaIdade /contadorIdade;
		
		x++;
		y++;
		System.out.println("*************************************************************");
		System.out.println ("O cliente número " + y + " apresenta os dados:");
		System.out.print("\nNome:" + cliente.getNome());
		System.out.print("\nCPF : " + cliente.getCPF());
		System.out.print("\nBairro : " + cliente.getBairro());
		System.out.print("\nRecorrente : " + cliente.isRecorrente());
		System.out.print("\nIdade : " + cliente.getIdade());
		System.out.println("\n");
		System.out.println("A compensação monetária do cliente " + y + 
				" foi igual a " + compensacao + " com direito a bônus de "+ bonus+ "reais!");
		System.out.println("*************************************************************");
		
		}while(x<1);
		System.out.println(condicaobonus); 
		System.out.println(cliente.getContadorIdade());
		 System.out.println(cliente.getSomaIdade());
		 System.out.println(cliente.getMediaIdade());
		 
	}
	}


