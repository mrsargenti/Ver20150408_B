package noleggi;

public class Bilico
{
	private double portata;
	
	/**
	 * @param portata
	 */
	public Bilico(String ID, String descrizione, int veicoliTotali, double portata) {
		super();
		if(portata > 0){
			this.portata = portata;
		}
		else{
			throw new IllegalArgumentException("La portata deve essere positiva.");
		}
	}

	/**
	 * @return the portata
	 */
	public double getPortata() {
		return portata;
	}
	
}