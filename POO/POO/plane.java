package POO;

public class plane {
	
	private String itinerario; 
	private String modelo;
	private String numberTurbinas;
	
	public plane (String itinerario,String modelo,String numberTurbinas)
	{
		this.itinerario = itinerario;
		this.modelo = modelo;
		this.numberTurbinas = numberTurbinas;
	}
	public void imprimirInfo()
	{
		System.out.println("***Informações do avião***" + "\nitinerario: " + itinerario +
				"\nModelo: "+modelo+"\nnumberTurbinas: "+ numberTurbinas);
	}
	public String getItinerario() {
		return itinerario;
	}
	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumberTurbinas() {
		return numberTurbinas;
	}
	public void setNumberTurbinas(String numberTurbinas) {
		this.numberTurbinas = numberTurbinas;
	}

}
