package noleggi;

public class Auto
{
	private int porte;
	
	/**
	 * @param porte
	 */
	public Auto(String ID, String descrizione, int veicoliTotali, int porte) {
		super();
		if(porte > 0){
			this.porte = porte;
		}
		else{
			throw new IllegalArgumentException("Le porte devono essere positive.");
		}
	}

	/**
	 * @return the porte
	 */
	public int getPorte() {
		return porte;
	}
	
}